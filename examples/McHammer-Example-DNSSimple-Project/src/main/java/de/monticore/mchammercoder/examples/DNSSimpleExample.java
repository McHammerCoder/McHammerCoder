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

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
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

public class DNSSimpleExample {

	private static DNSSimpleParser parser = new DNSSimpleParser();
	
	public static void main(String[] args)  throws Exception
	{
		if( args.length < 1 )
			throw new Exception("usage: .jar <filename>");
		
		try {		
			// Read data from file			
			Path path = Paths.get(args[0]);
			byte[] data = Files.readAllBytes(path);
				
			// Parse data
			ParseTree pt = parser.parse(data);

			// Check all terminal nodes
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(new ExampleVisitor(), pt);

			// Display parse tree
			System.out.println(pt.getText());
			displayParseTree(pt);			
		}
		catch( Exception ex )
		{
			System.out.println("Something went wrong:");
			ex.printStackTrace();
		}
	}

	public static void displayParseTree(ParseTree tree)
	{
		JFrame frame = new JFrame("Antlr AST");
		JPanel panel = new JPanel();
		TreeViewer viewr = new TreeViewer(Arrays.asList( DNSSimpleTreeHelper.RuleTypeNames ),tree);
		viewr.setScale(1.5);//scale a little
		panel.add(viewr);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);

		while(frame.isVisible());
	}
	
	static class ExampleVisitor implements ParseTreeListener
	{
		@Override
		public void visitTerminal(TerminalNode node) {
			if(!DNSSimpleChecker.check(node.getSymbol()))
				System.out.println("Invalid or dangerous node was found! " + node.getText());
		}

		@Override public void enterEveryRule(ParserRuleContext ctx) { }

		@Override public void exitEveryRule(ParserRuleContext ctx) { }

		@Override public void visitErrorNode(ErrorNode node) { }
	}

}
