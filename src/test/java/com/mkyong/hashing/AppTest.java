package com.mkyong.hashing;

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
public void testeven(){
Evenodd ob= new Evenodd();
String avalue=ob.checkeven((7));
String evalue="odd num";
assertEquals(avalue,evalue);
}
    public void testApp()
    {
        assertTrue( true );
    }


public void testeven1(){
Evenodd ob= new Evenodd();
String avalue=ob.checkeven((8));
String evalue="even num";
assertEquals(avalue,evalue);
}
}
