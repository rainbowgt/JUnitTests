package edu.ecnu.sei.junit.recap;

import org.junit.jupiter.api.Test;

public class InterestingCoverageMetricInstruction2 {
	
		
	@Test
    void op1_is_false_op2_is_true_op3_false() {
    	
    	InterestingCoverageMetric icm = new InterestingCoverageMetric();
    	icm.usualLogic(false,true,false);
    	icm.nestedLogic(false,true,false);
    	
    }
	
	@Test
    void op1_is_true_op2_is_false_op3_true() {
    	
    	InterestingCoverageMetric icm = new InterestingCoverageMetric();
    	icm.usualLogic(true,false,true);
    	icm.nestedLogic(true,false,true);
	}
	
	@Test
    void op1_is_true_op2_is_true_op3_false() {
    	
    	InterestingCoverageMetric icm = new InterestingCoverageMetric();
    	icm.usualLogic(true,true,false);
    	icm.nestedLogic(true,true,false);
	}
	
	
}
