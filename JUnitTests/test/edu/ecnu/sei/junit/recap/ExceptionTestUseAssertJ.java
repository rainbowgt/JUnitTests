package edu.ecnu.sei.junit.recap;

import org.junit.Test;
import static edu.ecnu.sei.junit.recap.ThrowableCaptor.thrownBy;
import static org.assertj.core.api.Assertions.assertThat;

public class ExceptionTestUseAssertJ {

	
	@Test
	public void test_tryException_method_throw_Expected_Exception() {
		
		//arrange
		Integer[] op = null;
		ExceptionHandlingDemo ecd = new ExceptionHandlingDemo();
	    
		//act
		Throwable actual = thrownBy(()->ecd.tryException(op));
		
		//assert
		assertThat(actual)
		.isInstanceOf(NullPointerException.class);
	}
	
	
	@Test
	public void test_throwException_method_should_throw_RuntimeException() {
		
		//arrange
	 	ExceptionHandlingDemo ecd = new ExceptionHandlingDemo();
	    
		//act
		Throwable actual = thrownBy(()->ecd.throwException());
			
		//assert
		assertThat(actual)
		.isInstanceOf(RuntimeException.class)
		.hasMessageContaining("sur");
		
	}
	
}
