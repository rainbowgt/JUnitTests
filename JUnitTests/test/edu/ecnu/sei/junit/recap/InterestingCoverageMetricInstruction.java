package edu.ecnu.sei.junit.recap;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;


public class InterestingCoverageMetricInstruction {
	
	@Test
	@Disabled	
    void op1_is_false_op2_is_true_op3_false() {
    	
    	InterestingCoverageMetric icm = new InterestingCoverageMetric();
    	icm.usualLogic(false,true,false);
    	icm.unUsualLogic(false,true,false);

    	
    }
	
    
	@Test
    void op1_is_true_op2_is_false_op3_true() {
    	
    	InterestingCoverageMetric icm = new InterestingCoverageMetric();
    	icm.usualLogic(true,false,true);
    	icm.unUsualLogic(true,false,true);
 
	}
	

	@Test
	@Disabled	
    void op1_is_true_op2_is_true_op3_false() {
    	
    	InterestingCoverageMetric icm = new InterestingCoverageMetric();
    	icm.usualLogic(true,true,false);
    	icm.unUsualLogic(true,true,false);

	}
	
	
}
