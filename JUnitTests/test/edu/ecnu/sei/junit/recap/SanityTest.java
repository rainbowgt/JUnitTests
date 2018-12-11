package edu.ecnu.sei.junit.recap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SanityTest {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("************ Before Class is invoked");
	}
	
	@Before
	public void before() {
		System.out.println("________________");
		System.out.println("\tBefore is invoked");		
	}
	
	@After
	public void after() {
		System.out.println("\tAfter is invoked");
	}
	
	@Test
	public void This_is_the_1st_test_method() {
		System.out.println("\t\tThe 1st test method is invoked");
	}
	
	@Test
	public void This_is_the_2nd_test_method() {
		System.out.println("\t\tThe 2nd test method is invoked");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("************ After Class is invoked");
	}

}
