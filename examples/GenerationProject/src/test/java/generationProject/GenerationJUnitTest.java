package generationProject;

import java.io.File;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class GenerationJUnitTest 
    extends TestCase
{
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public GenerationJUnitTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( GenerationJUnitTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    
    public void testParser()
    {    	
    	String [] args = {"src/test/resources/HTMLRed.mc4", "-o", "out/TestTool/src/main/java/"};
    	GenerationTest.main(args);
    	assertTrue(true);
    }
}