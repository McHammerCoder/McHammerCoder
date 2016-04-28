package de.mchammer.testarea;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.runtime.CommonTokenFactory;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

import com.upstandinghackers.hammer.*;

import htmlred._mch_parser.*;
import htmlred._mch_parser.tree.*;

/**
 * Unit test for simple App.
 */
public class ParserTest 
    extends TestCase
{
	private HTMLRedParser htmlRedParser = new HTMLRedParser();
	
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
    		ex.printStackTrace();
    	}
    }
    
    public void displayParseTree(ParseTree tree)
    {
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList( HTMLRedTreeHelper.RuleTypeNames ),tree);
        viewr.setScale(1.5);//scale a little
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
        
        while(frame.isVisible());
    }
}
