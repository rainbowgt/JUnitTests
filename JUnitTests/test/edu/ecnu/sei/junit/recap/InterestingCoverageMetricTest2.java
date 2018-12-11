package edu.ecnu.sei.junit.recap;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterestingCoverageMetricTest2 {

   
    @Test
    void op1_is_true_op2_is_true_op3_true() {
    	
    	InterestingCoverageMetric icm = new InterestingCoverageMetric();
    	icm.usualLogic(true,true,true);
    	icm.unUsualLogic(true,true,true);
    	icm.nestedLogic(true,true,true);
    	
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
    void op1_is_false_op2_is_true_op3_true() {
    	
    	InterestingCoverageMetric icm = new InterestingCoverageMetric();
    	icm.usualLogic(false, true,true);
    	icm.unUsualLogic(false, true,true);
    	icm.nestedLogic(false, true,true);
    	
    }
   
   
   @Test
   void op1_is_false_op2_is_false_op3_false() {
   	
   	InterestingCoverageMetric icm = new InterestingCoverageMetric();
   	icm.usualLogic(false,false,false);
   	icm.unUsualLogic(false,false,false);
   	icm.nestedLogic(false,false,false);
   	
   }
   

}
