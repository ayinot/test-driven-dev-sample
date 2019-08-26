package com.ocap.TddSample;


import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;

public class TestJUnit {
	
	private ArrayList<String> list;
	
	@BeforeClass
	public static void m1() {
		System.out.println("Using @Before Class, excecuted before all test cases");
	}
	
	@Before
	public void m2() {
		list = new ArrayList<String>();		
		System.out.println("Using @Before annotations, excecuted before every test cases");
	}
	
	@AfterClass
	public static void m3() {
		System.out.println("using @AfterClass, excecuted after all test cases");
	}
	
	@After
	public void m4() {
		list.clear();
	}
	
	@Test 
	public void m5() {
		list.add("test");
		assertFalse(list.isEmpty());
		assertEquals(1,list.size());
	}
	
	@Ignore
	public void m6() {
		System.out.println("Using @Ignore, this execution is ignored");
	}
	
	@Test(timeout =10) 
	public void m7(){
		System.out.println("Used to enforce timeout operation");
	}
	
	@Test(expected = NoSuchMethodException.class)
	public void m8() {
		System.out.println("Checks for exception");
	}
}
