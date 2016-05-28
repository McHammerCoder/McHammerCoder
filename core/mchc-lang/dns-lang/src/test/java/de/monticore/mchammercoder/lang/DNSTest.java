package de.monticore.mchammercoder.lang;


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

import de.monticore.mchammerparser.*;

import dns._mch_parser.*;
import dns._mch_parser.tree.*;
import dns._coder.pp.*;

/**
 * Unit test for simple App.
 */
public class DNSTest 
    extends TestCase
{
	private DNSParser dnsParser = new DNSParser();
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DNSTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DNSTest.class );
    }

    public void testHTMLRedParser()
    {
    	try 
    	{
    		byte [] message = { 
    				// Header
    	            0x00, 0x01, // ID
    	            0x0A, 		// (0 0001 0 1 0) QR opcode(4 bits) AA TC RD
    	            (byte)0x81, // (1 000 0001) RA Z RCode
    	            0x00, 0x01, // QDCOUNT
    	            0x00, 0x01, // ANCOUNT
    	            0x00, 0x00, // NSCOUNT
    	            0x00, 0x00,  // ARCOUNT
    	            
    	            // Question
    	            // === QName ===
    	            0x00, 0x05, // Label-Length 
    	            (byte)'L', 
    	            (byte)'a', 
    	            (byte)'b', 
    	            (byte)'e', 
    	            (byte)'l', // Label
    	            0x00, 0x00,
    	            // === QType ===
    	            0x00, 0x01, 
    	            // === QClass ===
    	            0x00, 0x01,
    	            
    	            // Answer
    	            0x00, 0x05, // Label-Length 
    	            (byte)'L', 
    	            (byte)'a', 
    	            (byte)'b', 
    	            (byte)'e', 
    	            (byte)'l', // Label
    	            0x00, 0x00,
    			    0x00, 0x01, // Type
    			    0x00, 0x02, // Class
    			    0x00, 0x00, 0x00, 0x03, // TTL
    			    0x00, 0x01, // RLen
    			    0x04 // RData 
    		};
    	
    		ParseTree pt = dnsParser.parse(message);
    		
    		assertTrue(pt != null);

    		System.out.println("DNSParser:");
    		System.out.println(pt.getText());
    	}
    	catch(Exception ex)
    	{
    		ex.printStackTrace();
    		fail("HTMLRedParser Failed!");
    	}
    }
}
