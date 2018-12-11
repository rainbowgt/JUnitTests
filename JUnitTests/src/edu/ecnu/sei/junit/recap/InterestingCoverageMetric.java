package edu.ecnu.sei.junit.recap;

public class InterestingCoverageMetric {
	
/*	public String pathExample(boolean condition){ 
		
		String value = null; 
		
		if(condition){
		   value = " " + condition + " "; 
		}
		
		return value.trim();
		
	}
	*/
	public boolean usualLogic(boolean op1,boolean op2,boolean op3){
		
		boolean output = false;
		
		if ((op1 && op2) || op3){
			
			 output = true;	
		}
		
		return output;
		
	}
	
	public boolean unUsualLogic(boolean op1,boolean op2,boolean op3){
		
		boolean output = false;
		boolean condition1 = op1 && op2;
		boolean condition2 = condition1 || op3;
				
		if (condition2){
		   output = true;	
		}
		
		return output;
	}
	
	
	public boolean nestedLogic(boolean op1,boolean op2,boolean op3) {
		
		boolean output = false;
		
		if(op1) {
			if(op2)
				output = true;
			else {
				   if(op3) { 
				      output = true;
				   }
				   else {
				     output = false;
				   } 
					  
			}
		}
		else {
			   if(op3) {
				 output = true; 
			   }				  
			   else { 
				 output = false;
			   }
		}
		return output;
	}
}

