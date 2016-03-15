package de.mchammer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TestAntlrTest 
    extends TestCase
{
		
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestAntlrTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestAntlrTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    
    public void testParser()
    {
    	TestAntlr testApp = new TestAntlr();
    	testApp.generateParser("Hello.g4");
    	assert(true);
    }
}
