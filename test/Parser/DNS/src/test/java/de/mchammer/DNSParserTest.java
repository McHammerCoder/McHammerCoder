package de.mchammer;

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

import de.mchammer.tree.HAParseTree;
import de.mchammer.tree.HATerminalNode;
import de.mchammer.tree.TreeFactory;
import de.mchammer.tree.TreeHelper;

/**
 * Unit test for simple App.
 */
public class DNSParserTest 
    extends TestCase
{
	private Parser parser = new Parser();
	private byte [] message = { 
			// Header
            0x00, 0x01, // ID
            0x0A, 		// (0 0001 0 1 0) QR opcode(4 bits) AA TC RD
            (byte)0x81, // (1 000 0001) RA Z RCode
            0x00, 0x02, // QDCOUNT
            0x00, 0x03, // ANCOUNT
            0x00, 0x04, // NSCOUNT
            0x00, 0x05,  // ARCOUNT
            
            // Question
            // === QName ===
            0x04, // Label-Length 
            0x00, 0x01, 0x02, 0x03, // Label
            (byte)' ',
            // === QType ===
            0x00, 0x01, 
            // === QClass ===
            0x00, 0x01,
            
            // RR
            (byte)'w', // Domain
		    (byte)'w', 
		    (byte)'w', 
		    (byte)'.', 
		    (byte)'g', 
		    (byte)'o', 
		    (byte)'o', 
		    (byte)'g',
		    (byte)'l',
		    (byte)'e',
		    (byte)'.',
		    (byte)'c',
		    (byte)'o',
		    (byte)'m',
		    0x00, 0x01, // Type
		    0x00, 0x02, // Class
		    0x00, 0x00, 0x00, 0x03, // TTL
		    0x00, 0x01, // RLen
		    0x04 // RData   
	};
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DNSParserTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DNSParserTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    
    public void testParser()
    {
    	ParseResult res = parser.parse(message);
    	
    	assertTrue(res != null);
    	
    	if( res != null )
        {
        	printResult(res.getAst());
        	System.out.println();
        	printSResult(res.getAst());
        	System.out.println("\nSuccess !");
        	
        	ParseTree pt = TreeFactory.create(res);
        	System.out.println(pt.toStringTree());
        	//displayParseTree(pt);
        }
        else
        {
        	System.out.println("Failure !");
        }
    }
    
    public void displayParseTree(ParseTree tree)
    {
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList( TreeHelper.RuleTypeNames ),tree);
        viewr.setScale(1.5);//scale a little
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
        
        while(frame.isVisible());
    }
    
    public void testParseTree()
    {
    	CommonTokenFactory fac = new CommonTokenFactory();
    	HAParseTree parseTree = new HAParseTree(null);
    	
    	parseTree.addChild( new HATerminalNode(fac.create(0, "(")) );
    	parseTree.addChild( new HATerminalNode(fac.create(0, " ")) );
    	parseTree.addChild( new HATerminalNode(fac.create(0, "Hallo Welt!")) );
    	parseTree.addChild( new HATerminalNode(fac.create(0, " ")) );
    	parseTree.addChild( new HATerminalNode(fac.create(0, ")")) );
    	
    	int childCount = parseTree.getChildCount();
    	assertTrue(childCount == 5);
    	
    	System.out.println("ChildCount = " + childCount);
    	System.out.println("Text = " + parseTree.toStringTree());
    }
    
    public void printResult( ParsedToken tok )
    {
    	if( tok != null )
    	{
    		switch(tok.getTokenType())
    		{
    		case NONE: System.out.println("NONE"); break;
    		case BYTES: byte[] bytes = tok.getBytesValue(); 
    		            for( byte b : bytes )
    		            {
    		            	System.out.println(b+" ");
    		            }
    		            break;
    		case SINT: System.out.print(tok.getSIntValue()+" "); break;
    		case UINT: System.out.print(tok.getUIntValue()+" "); break;
    		case SEQUENCE: ParsedToken[] seq = tok.getSeqValue();
    					   for( ParsedToken t : seq )
    		               {
    		            	   printResult(t);
    		               }
    		               break;
    		case ERR: System.out.println("An error occured!"); break;
    		case USER: System.out.println("User"); break; //no supported jet
    		}
    	}
    }
    
    public void printSResult( ParsedToken tok )
    {
    	if( tok != null )
    	{
    		switch(tok.getTokenType())
    		{
    		case NONE: System.out.println("NONE"); break;
    		case BYTES: byte[] bytes = tok.getBytesValue(); 
    		            for( byte b : bytes )
    		            {
    		            	System.out.println((char)b);
    		            }
    		            break;
    		case SINT: System.out.print((char)tok.getSIntValue()); break;
    		case UINT: System.out.print((char)tok.getUIntValue()); break;
    		case SEQUENCE: ParsedToken[] seq = tok.getSeqValue();
    					   for( ParsedToken t : seq )
    		               {
    						   printSResult(t);
    		               }
    		               break;
    		case ERR: System.out.println("An error occured!"); break;
    		case USER: System.out.println("User"); break; //no supported jet
    		}
    	}
    }
}
