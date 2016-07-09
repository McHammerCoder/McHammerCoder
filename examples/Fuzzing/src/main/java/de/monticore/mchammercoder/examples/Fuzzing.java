package de.monticore.mchammercoder.examples;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Exception;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.gui.TreeViewer;
import org.apache.commons.io.output.TeeOutputStream;

import java.nio.file.Files;

import com.google.common.io.ByteStreams;
import com.google.common.primitives.Bytes;
import com.upstandinghackers.hammer.ParseResult;

import de.monticore.mchammerparser.*;
import dnssimple._mch_parser.*;
import dnssimple._mch_parser.tree.*;
import dnssimple._coder.pp.*;

public class Fuzzing 
{
	private static DNSSimpleParser parser = new DNSSimpleParser();
	private static DNSSimplePP pp = new DNSSimplePP();
	
	public static void main(String[] args)  throws Exception
	{
		/*
		DNSSimpleParser parser = new DNSSimpleParser();
		
		try
		{
				
			while(true)
			{
				List<Byte> bytes = new ArrayList<Byte>();
				DataInputStream dis = new DataInputStream(System.in);
				
				while ( dis.available() > 0 )
				{
					byte b = dis.readByte();
					bytes.add(b);
				}
				
				if( bytes.size() > 0)
				{
					System.out.println("Recvd!");
				}
			}
			
					
		}
		catch(IOException io)
		{
			io.printStackTrace();
		}	
		*/
		
		
		if( args.length < 2 )
			throw new Exception("usage: .jar <type> <filename>");
		else
		{
			try {
				switch( args[0] )
				{
				case "DNS": 
					
							Path path = Paths.get(args[1]);
							byte[] data = Files.readAllBytes(path);
					
							System.out.println(parser.parse(data).getText());
							break;
							
				case "DNS_STRESS_TEST":
					
							try {
							    FileOutputStream fos = new FileOutputStream("logging.log");
							    //we will want to print in standard "System.out" and in "file"
							    TeeOutputStream myOut=new TeeOutputStream(System.out, fos);
							    PrintStream ps = new PrintStream(myOut);
							    System.setOut(ps);
							} catch (Exception e) {
							    e.printStackTrace();
							}
					
							Path folder = Paths.get(args[1]);
							File[] files = folder.toFile().listFiles();
							
							boolean allOk = true;
							
							int i = 1;
							int numFiles = files.length;
							for( File file : files )
							{
								boolean parseFailed = false;
								boolean containsAnswer = false;
								String domain = "";
								byte[] bytes = Files.readAllBytes(file.toPath());
								
								try {									
									ParseTree pt = parser.parse(bytes);
									
									if( Arrays.equals(bytes, pp.prettyPrint(pt)) )
									{
										long value = ((HABinarySequenceToken)((HATerminalNode)pt.getChild(0).getChild(2)).getSymbol()).getValue(0).getValue();
										containsAnswer = value > 0;
									}
									else
									{
										throw new Exception("ERROR!");
									}								
								}
								catch( MCHParserException ex )
								{
									parseFailed = true;
								}	
								
								DatagramSocket clientSocket = new DatagramSocket();
								InetAddress IPAddress = InetAddress.getByName("localhost");
								byte[] receiveData = new byte[1024];								
								DatagramPacket sendPacket = new DatagramPacket(bytes, bytes.length, IPAddress, 53);
								clientSocket.send(sendPacket);
								DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
								clientSocket.receive(receivePacket);
								String modifiedSentence = new String(receivePacket.getData());
								clientSocket.close();	
								
								if( (receiveData[3] & 7) >= 1 && (receiveData[3] & 7) <= 5 && parseFailed )
								{
									//System.out.println("Perfect !");
								}
								else if( parseFailed && !modifiedSentence.contains("root-server") && !(modifiedSentence.length() > 256) )
								{
									allOk = false;
									
									System.out.print("(" + i + "/" + numFiles + ") File: " + file.getName() + " - ");
									System.out.println("False Negative !?");
									System.out.println("FROM SERVER:" + modifiedSentence);
								}
								else if( (receiveData[3] & 7) >= 1 && (receiveData[3] & 7) <= 5 )
								{
									if( !containsAnswer )
									{
										allOk = false;
										
										System.out.print("(" + i + "/" + numFiles + ") File: " + file.getName() + " - ");
										System.out.println("False Positive !?");
										System.out.println("FROM SERVER:" + modifiedSentence);
									}		
									/*else
										System.out.println("Perfect !");*/
								}
								/*else
								{
									System.out.println("Perfect !");
								}*/	
								
								if( i%250 == 0 )
								{
									System.out.println("(" + i + "/" + numFiles + ")");
								}
								
								i++;
							}
							
							if( allOk )
								System.out.println("Success !");
							else
								System.out.println("Failure !");
							
							break;
							
				default: 	throw new Exception("invalid type: " + args[0]);
				}
			}
			catch( Exception ex )
			{
				System.out.println("Something went wrong:");
				ex.printStackTrace();
			}			
		}
			
	}
}