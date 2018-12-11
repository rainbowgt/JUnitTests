package edu.ecnu.sei.junit.recap;



public class ExceptionCoverageMetric {
	
	public int tryException(Integer[] op) {
		
		int sum = 0;
		
		try {
               for (int i = 0; i<op.length; i++) {
            	   
            	     sum += op[i];
               }
			
		}catch(NullPointerException npe) {
			
		      return 0;
		}
		
		return sum;
	} 
	
	
	public int throwException() {
	
		throw new RuntimeException("surprise!");
	}

}



