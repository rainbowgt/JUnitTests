package edu.ecnu.sei.junit.recap;

public class CoverageMetric {
	
	public int absSum(Integer op1, Integer op2) {
		
		if((op1 == null) && (op2 == null)){
			return 0;
		}
		
		
		if((op1 == null) &&( op2 != null)){
			return Math.abs(op2);
		}
		

		if(op2 == null) {
			return Math.abs(op1);
		}
		
		return Math.abs(op1)+Math.abs(op2);
	}
}


/* if(op1 == null) change this condition so that it doesn't always evaluate to false*/

