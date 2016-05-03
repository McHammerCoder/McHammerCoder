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
import org.antlr.v4.runtime.tree.gui.TreeViewer;

import com.upstandinghackers.hammer.*;

/*
import htmlred._mch_parser.*;
import htmlred._mch_parser.tree.*;

import domain._mch_parser.*;
import domain._mch_parser.tree.*;

import stringgrammar._mch_parser.*;
import stringgrammar._mch_parser.tree.*;

import negatedstringgrammar._mch_parser.*;
import negatedstringgrammar._mch_parser.tree.*;
*/

import offset._mch_parser.*;
import offset._mch_parser.tree.*;

/**
 * Unit test for simple App.
 */
public class ParserTest 
    extends TestCase
{
	/*
	private HTMLRedParser htmlRedParser = new HTMLRedParser();
	private DomainParser domainParser = new DomainParser();
	private StringGrammarParser stringGrammarParser = new StringGrammarParser();
	private NegatedStringGrammarParser negStringGrammarParser = new NegatedStringGrammarParser();
	*/
	private OffsetParser offsetParser = new OffsetParser();
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ParserTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ParserTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    /*
    public void testHTMLRedParser()
    {
    	try 
    	{
    		String message = "<p><p><b>Text</b></p><i>Text</i></p>";
    	
    		ParseTree pt = htmlRedParser.parse(message.getBytes());
    	
    		assertTrue(pt != null);
    	
    		System.out.println("HTMLRedParser:");
    		System.out.println(pt.getText());
    	}
    	catch(Exception ex)
    	{
    		fail("HTMLRedParser Failed!");
    	}
    }
    
    public void testDomainParser1()
    {
    	try 
    	{
    		String message = "www.google.com\n";
    	
    		ParseTree pt = domainParser.parse(message.getBytes());
    	
    		assertTrue(pt != null);
    	
    		System.out.println("DomainParser1:");
    		System.out.println(pt.getText());
    	}
    	catch(Exception ex)
    	{
    		fail("DomainParser1 Failed!");
    	}
    }
    
    public void testDomainParser2()
    {
    	try 
    	{
    		String message = "w-ww.goo-gle.c-om\n";
    	
    		ParseTree pt = domainParser.parse(message.getBytes());
    	
    		assertTrue(pt != null);
    	
    		System.out.println("DomainParser2:");
    		System.out.println(pt.getText());
    	}
    	catch(Exception ex)
    	{
    		fail("DomainParser2 Failed!");
    	}
    }
    
    public void testDomainParser3()
    {
    	try 
    	{
    		String message = "www.-google.com\n";
    	
    		ParseTree pt = domainParser.parse(message.getBytes());
    	
    		fail("DomainParser3 Failed!");
    	}
    	catch(Exception ex)
    	{
    		assertTrue(true);
    	}
    }
    
    public void testDomainParser4()
    {
    	try 
    	{
    		String message = "www.google-.com\n";
    	
    		ParseTree pt = domainParser.parse(message.getBytes());
    	    	
    		fail("DomainParser4 Failed!");
    	}
    	catch(Exception ex)
    	{
    		assertTrue(true);
    	}
    }
    
    public void testStringGrammarParser1()
    {
    	try 
    	{
    		String message = "abcABC##xxXXxx";
    	
    		ParseTree pt = stringGrammarParser.parse(message.getBytes());
    	    	
    		assertTrue(pt != null);
        	
    		System.out.println("stringGrammarParser1:");
    		System.out.println(pt.getText());
    	}
    	catch(Exception ex)
    	{
    		fail("StringGrammarParser1 Failed!");
    	}
    }
    
    public void testStringGrammarParser2()
    {
    	try 
    	{
    		String message = "aA#xXx";
    	
    		ParseTree pt = stringGrammarParser.parse(message.getBytes());
    	    	
    		assertTrue(pt != null);
        	
    		System.out.println("stringGrammarParser2:");
    		System.out.println(pt.getText());
    	}
    	catch(Exception ex)
    	{
    		fail("StringGrammarParser2 Failed!");
    	}
    }
    
    public void testStringGrammarParser3()
    {
    	try 
    	{
    		String message = "A#xXx";
    	
    		ParseTree pt = stringGrammarParser.parse(message.getBytes());
    	    	
    		fail("StringGrammarParser3 Failed!");
    	}
    	catch(Exception ex)
    	{
    		assertTrue(true);
    	}
    }
    
    public void testStringGrammarParser4()
    {
    	try 
    	{
    		String message = "aA#Xx";
    	
    		ParseTree pt = stringGrammarParser.parse(message.getBytes());
    	    	
    		fail("StringGrammarParser4 Failed!");
    	}
    	catch(Exception ex)
    	{
    		assertTrue(true);
    	}
    }
    
    public void testNegatedStringGrammarParser1()
    {
    	try 
    	{
    		String message = "A1$#_";
    	
    		ParseTree pt = negStringGrammarParser.parse(message.getBytes());
    	    	
    		assertTrue(pt != null);
        	
    		System.out.println("negStringGrammarParser1:");
    		System.out.println(pt.getText());
    	}
    	catch(Exception ex)
    	{
    		fail("negStringGrammarParser1 Failed!");
    	}
    }
    */
    public void testOffsetParser1()
    {
    	try 
    	{
    		String message = "!...,...Test..,....,....,....,...#,....,...";
    	
    		ParseTree pt = offsetParser.parse(message.getBytes());		
    		
    		assertTrue(pt != null);
        	
    		System.out.println("OffsetParser1:");
    		System.out.println(pt.getText());
    	}
    	catch(Exception ex)
    	{
    		
    		fail(ex.getMessage());
    	}
    }
    
    public void displayParseTree(ParseTree tree)
    {
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList( OffsetTreeHelper.RuleTypeNames ),tree);
        viewr.setScale(1.5);//scale a little
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
        
        while(frame.isVisible());
    }
}
