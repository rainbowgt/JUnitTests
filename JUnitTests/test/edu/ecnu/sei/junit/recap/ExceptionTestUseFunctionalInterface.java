package edu.ecnu.sei.junit.recap;

import org.junit.Assert;
import org.junit.Test;

import static edu.ecnu.sei.junit.recap.ThrowableCaptor.thrownBy;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class ExceptionTestUseFunctionalInterface {

	
	@Test
	public void test_tryException_method_throw_Expected_Exception() {
		
		//arrange
		Integer[] op = null;
		ExceptionHandlingDemo ecd = new ExceptionHandlingDemo();
	    
		//act
		Throwable actual = thrownBy(()->ecd.tryException(op));
		
		//assert
		Assert.assertNotNull(actual);
		Assert.assertTrue(actual instanceof NullPointerException);
	}
	
	@Test
	public void test_throwException_method_should_throw_RuntimeException() {
		
		//arrange
		Integer[] op = null;
		ExceptionHandlingDemo ecd = new ExceptionHandlingDemo();
	    
		//act
		Throwable actual = thrownBy(()->ecd.throwException());
		String message = actual.getMessage();
		
		//assert
		Assert.assertNotNull(actual);
		Assert.assertTrue(actual instanceof RuntimeException);
		assertThat(message, containsString("surprise"));
		
	}
	
}
