package edu.ecnu.sei.junit.recap;

import org.junit.Test;

public class ExceptionTestUseTestAnnotation {
	
	
	@Test(expected = NullPointerException.class )	
	public void test_tryException_method_throw_Expected_Exception() {
	
		Integer[] op = null;
		ExceptionHandlingDemo ecd = new ExceptionHandlingDemo();
	    ecd.tryException(op);
		
	}
	
	@Test(expected = IndexOutOfBoundsException.class )	
	public void test_tryException_method_throw_unExpected_Exception() {
	
		Integer[] op = null;
		ExceptionHandlingDemo ecd = new ExceptionHandlingDemo();
	    ecd.tryException(op);
		
	}
	
	
	@Test(expected = RuntimeException.class )	
	public void test_throwException_method_should_throw_RuntimeException() {
	
		ExceptionHandlingDemo ecd = new ExceptionHandlingDemo();
	    ecd.throwException();
	}	
}

