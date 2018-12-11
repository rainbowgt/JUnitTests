package edu.ecnu.sei.junit.recap;

public class DoubleDiamond {
	
	
	public int  doubleDiamand(int num1, int num2, int num3) {
		
				
		if ((num1 > 1) && (num2 == 0))
			num3 /= num1; 
		
		if((num1 == 2) || (num3 > 1))
			num3 += 1;
		
		return num3;
	}

	
}

