package de.mchammer.testarea;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.TestFailure;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.runtime.CommonTokenFactory;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

import com.upstandinghackers.hammer.*;


import htmlred._mch_parser.*;
import htmlred._mch_parser.tree.*;

import htmlred._coder.*;

/**
 * Unit test for simple App.
 */
public class CoderTest 
    extends TestCase
{
	private HTMLRedParser htmlRedParser = new HTMLRedParser();
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CoderTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CoderTest.class );
    }

    public void testHTMLRedCoder()
    {
    	try 
    	{
    		String message = "<p><p><b>Text</b></p><i>Text</i></p>";
    	
    		runTest(message,"<p>");
    		
    		runTest(message,"Text");
    	}
    	catch(Exception ex)
    	{
    		fail("HTMLRedCoder Failed!");
    	}
    }
    
    public void runTest(String message, String injection) throws Exception
    {
    	ParseTree pt = htmlRedParser.parse(message.getBytes());
    			
		// Injector
		HTMLRedInjector injector = new HTMLRedInjector(injection);
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(injector, pt); 
		
		System.out.println();
		System.out.println("Injection:");
		System.out.println(pt.getText());
		
		String injectedMessage = pt.getText();
		
		// Encode
		System.out.println();
		System.out.println("Encoded Template:");
		HTMLRedEncoderVisitor encoder = new HTMLRedEncoderVisitor();
		walker.walk(encoder, pt); 
		System.out.println();
		
		System.out.println(pt.getText());
		
		pt = htmlRedParser.parse(pt.getText().getBytes());

		System.out.println();
		System.out.println("ReparseResult:");
		System.out.println(pt.getText());
			
		// Decode
		System.out.println();
		System.out.println("Decode Template:");
		HTMLRedDecoderVisitor decoder = new HTMLRedDecoderVisitor();
		walker.walk(decoder, pt); 
		System.out.println();
		
		System.out.println(pt.getText());
		    	    		
		assertTrue(pt.getText().equals(injectedMessage));
    }
    
}
