package testTool;

import java.io.File;
import java.io.IOException;

import example.HTMLRedTool;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TestTool
    extends TestCase
{
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestTool( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestTool.class );
    }

    /**
     * Rigourous Test :-)
     */
    
    public void testParser()
    {    	
    	String [] args = { "test.html", "<p>" };
    	try 
    	{
			HTMLRedTool.main(args);
		} catch (IOException e) 
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	assertTrue(true);
    }
}