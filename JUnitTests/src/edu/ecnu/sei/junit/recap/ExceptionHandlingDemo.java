package edu.ecnu.sei.junit.recap;



public class ExceptionHandlingDemo {
	
	public int tryException(Integer[] op) {
		
		int sum = 0;
		
         for (int i = 0; i<op.length; i++) 
             sum += op[i];
		
		return sum;
	} 
	
	
	public int throwException() {
	
		throw new RuntimeException("surprise!");
	}

}




