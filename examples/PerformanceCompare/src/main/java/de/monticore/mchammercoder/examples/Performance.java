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
import xmlsimple._mch_parser.*;
import xmlsimple._mch_parser.tree.*;
import xmlsimple._coder.pp.*;

import mcxmlsimple._parser.*;

public class Performance 
{
	private static XMLSimpleParser parser = new XMLSimpleParser();
	private static XMLSimplePP pp = new XMLSimplePP();
	private static McXMLSimpleParser mcParser = new McXMLSimpleParser();
	
	
	public static void main(String[] args)  throws Exception
	{
		if( args.length < 1 )
			throw new Exception("usage: .jar <filename>");
		
		Path path = Paths.get(args[0]);
		byte[] data = Files.readAllBytes(path);
		
		long start = System.currentTimeMillis();
		
		for( int i = 0; i < 250; i++ )
		{
			try {
				parser.parse(data);
			}
			catch( MCHParserException ex )
			{
				System.out.println(ex.getMessage());
				System.exit(0);
			}
			
			if( i%10 == 0 )
				System.out.println("(" + i + "/250)");
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("MCH Parsed in : " + (end-start) + " ms");
		
		start = System.currentTimeMillis();
		
		for( int i = 0; i < 250; i++ )
		{
			mcParser.parseXML(args[0]);
			
			if( i%10 == 0 )
				System.out.println("(" + i + "/250)");
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("MC Parsed in : " + (end-start) + " ms");
	}
}