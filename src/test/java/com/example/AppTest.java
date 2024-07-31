package com.example;

import org.testng.Assert;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

 
    public void testConvertToJson() {
        Person person = new Person("PEDRO", "Aurélie");
        String json = App.convertToJson(person);
        Assert.assertTrue(json.contains("PEDRO") && json.contains("Aurélie"));
        }
    public void testCapitalizeString() {
        String capitalizedStr = "maven";
        String result = App.capitalizeString(capitalizedStr);
        Assert.assertEquals(result, "Maven");
    }  
}
