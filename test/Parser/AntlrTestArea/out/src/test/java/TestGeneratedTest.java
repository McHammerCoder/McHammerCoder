import java.util.List;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TestGeneratedTest 
    extends TestCase
{
	private List<String> ruleNames;
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestGeneratedTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestGeneratedTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    
    public void testParser()
    {
    	// create a CharStream that reads from standard input
    	ANTLRInputStream input;
		try {
			InputStream stream = new ByteArrayInputStream("www.google.com".getBytes(StandardCharsets.UTF_8));
			input = new ANTLRInputStream(stream);
			
	    	// create a lexer that feeds off of input CharStream
	    	HelloLexer lexer = new HelloLexer(input);
	    	// create a buffer of tokens pulled from the lexer
	    	CommonTokenStream tokens = new CommonTokenStream(lexer);
	    	// create a parser that feeds off the tokens buffer
	    	HelloParser parser = new HelloParser(tokens);
	    	ParseTree tree = parser.domain(); // begin parsing at init rule
	    	ruleNames = Arrays.asList(parser.getRuleNames());
	    	
	    	displayParseTree(tree);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			assert(false);
		}
    	assert(true);
    }
    
    public void displayParseTree(ParseTree tree)
    {
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(ruleNames,tree);
        viewr.setScale(1.5);//scale a little
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
        
        while(frame.isVisible());
    }
}