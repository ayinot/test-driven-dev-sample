package com.ocap.TddSample;

import java.io.File;

import org.junit.*;

public class OutputFileTest		
{
    private File output; 
    @Before	public void createOutputFile() 
    { 
       output = new File("");
    }
  
	@After public void deleteOutputFile() 
    {
        output.delete(); 
    } 
     
    @Test public void testFile1() 
    {
       // code for test case objective
    } 
	@Test public void testFile2() 
    {
       // code for test case objective
    }
}