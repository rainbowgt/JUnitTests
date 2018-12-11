package edu.ecnu.sei.junit.recap;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoverageMetricTestJ5 {

	private CoverageMetric cm;
	
	@BeforeEach
	void init() {
		
		cm = new CoverageMetric();		
	}
	
	@Test
	void test() {
		
		Integer op1 = null;
		Integer op2 = null;
		int ExpectedRlt = 0;
		int actualRlt = cm.absSum(op1, op2);
		
		assertEquals(ExpectedRlt,actualRlt);
	}

}
