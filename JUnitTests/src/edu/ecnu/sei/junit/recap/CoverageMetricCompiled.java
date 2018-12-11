package edu.ecnu.sei.junit.recap;

public class CoverageMetricCompiled {

	int[] visitedLines = new int[14];
	
	public int absSumModified(Integer op1,Integer op2) {
		
		visitedLines[0] = 1;
		
		if(op1 == null) {
		  visitedLines[1] = 1;
		  if(op2 == null) {
			visitedLines[2] = 1;
			return 0;
		   }else{
			   visitedLines[3] = 0;
			}
		 }else {
		   visitedLines[4] = 1;
		}
		
		visitedLines[5] = 1;
		if (op1 == null) {
			visitedLines[6] = 1;
			if(op2 !=null) {
				visitedLines[7] = 1;
				return Math.abs(op2);
			}else {
				visitedLines[8] = 1;
			}
		}else {
			visitedLines[9] = 0;
		}
		
		visitedLines[10] = 1;
		if(op2 == null) {
			visitedLines[11] = 1;
			return Math.abs(op1);
		}else {
			visitedLines[12] = 1;
		}
		visitedLines[13] =1;
		return Math.abs(op1) + Math.abs(op2);
		
	}
}



