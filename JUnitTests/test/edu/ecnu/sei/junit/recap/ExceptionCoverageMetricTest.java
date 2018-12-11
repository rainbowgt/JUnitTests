package edu.ecnu.sei.junit.recap;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExceptionCoverageMetricTest {

/*	@Test
	void op_is_null() {
		
		ExceptionCoverageMetric ecm = new ExceptionCoverageMetric();
		Integer[] numbers = null;
		int result = -1;
		result = ecm.tryException(numbers);
		assertEquals(0,result);		
	}*/
	
	
	@Test
	void length_of_op_is_0_jump_out_the_loop_directly() {
		
		ExceptionCoverageMetric ecm = new ExceptionCoverageMetric();
		Integer[] numbers = {};
		int result = -1;
		result = ecm.tryException(numbers);
		assertEquals(0,result);
	}
	
	
	@Test
	void length_of_op_is_1_loop_1_time() {
		
		ExceptionCoverageMetric ecm = new ExceptionCoverageMetric();
		Integer[] numbers = {2};
		int result = -1;
		result = ecm.tryException(numbers);
		assertEquals(2,result);
	}
	
	
  @Test
	void length_of_op_is_2_loop_2_time() {
		
		ExceptionCoverageMetric ecm = new ExceptionCoverageMetric();
		Integer[] numbers = {1,2};
		int result = -1;
		result = ecm.tryException(numbers);
		assertEquals(3,result);
	}
	
  
	/*@Test
	void throw_exception_coverage() {
		
		ExceptionCoverageMetric ecm = new ExceptionCoverageMetric();
		try {
		      ecm.throwException();
		      fail("No surprise");
		}catch(RuntimeException rte) {
             assertTrue(true);
		}		
	}*/
}	



