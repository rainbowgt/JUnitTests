package edu.ecnu.sei.junit.recap;

import java.math.BigDecimal;

public class BigDecimalDemo {
	
	public static void calByFloat() {
		System.out.println(0.06+0.01);
		System.out.println(0.06-0.01);
		System.out.println(0.06*0.01);
		System.out.println(0.06/0.01);
	}
	
	
	public static void calByBigDecimal() {
		BigDecimal op1 = BigDecimal.valueOf(0.06);
		BigDecimal op2 = BigDecimal.valueOf(0.01);
		System.out.println(op1.add(op2));
		System.out.println(op1.subtract(op2));
		System.out.println(op1.multiply(op2));
		System.out.println(op1.divide(op2));

	}
	
	
	public static void main(String[] args) {
		BigDecimalDemo b = new BigDecimalDemo();
		b.calByFloat();
		b.calByBigDecimal();
	}

}
