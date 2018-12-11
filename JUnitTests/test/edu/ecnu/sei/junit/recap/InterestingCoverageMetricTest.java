package edu.ecnu.sei.junit.recap;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterestingCoverageMetricTest {

/*	@Test
	void coverage_the_true_value() {
		InterestingCoverageMetric icm = new InterestingCoverageMetric();
		String result = icm.pathExample(true);
		assertEquals("true",result);
	}*/
	
   
    @Test
    void op1_is_true_op2_is_true_op3_false() {
    	
    	InterestingCoverageMetric icm = new InterestingCoverageMetric();
    	icm.usualLogic(true,true,false);
    	icm.unUsualLogic(true,true,false);
    	icm.nestedLogic(true,true,false);
    	
    }
    
    @Test
    void op1_is_true_op2_is_false_op3_true() {
    	
    	InterestingCoverageMetric icm = new InterestingCoverageMetric();
    	icm.usualLogic(true,false,true);
    	icm.unUsualLogic(true,false,true);
    	icm.nestedLogic(true,false,true);
    	
    }
    
    @Test
    void op1_is_true_op2_is_false_op3_false() {
    	
    	InterestingCoverageMetric icm = new InterestingCoverageMetric();
    	icm.usualLogic(true, false,false);
    	icm.unUsualLogic(true, false,false);
    	icm.nestedLogic(true, false,false);
    	
    }

    
    @Test
    void op1_is_false_op2_is_true_op3_false() {
    	
    	InterestingCoverageMetric icm = new InterestingCoverageMetric();
    	icm.usualLogic(false, true,false);
    	icm.unUsualLogic(false, true,false);
    	icm.nestedLogic(false, true,false);
    	
    }
    
     
   /*@Test
    void op1_is_false_op2_is_true_op3_true() {
    	
    	InterestingCoverageMetric icm = new InterestingCoverageMetric();
    	icm.usualLogic(false, true,true);
    	icm.unUsualLogic(false, true,true);
    	icm.nestedLogic(false, true,true);
    	
    }*/
    

}
