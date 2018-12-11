package edu.ecnu.sei.junit.recap;

import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.Assert;

import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class ExternalTheoryTest {
	
	@Theory
	public void adds_numbers(
	@ParametersSuppliedBy(NumberSupplier.class) Number num1,
	@ParametersSuppliedBy(NumberSupplier.class) Number num2
	) {
		System.out.println("num1 + num2 = " + num1 + " + " + num2 + " = " + num1+num2);
	}
	
	
	@Theory
	public void add_numbers_test(
			@ParametersSuppliedBy(NumberSupplier.class) Number num1,
			@ParametersSuppliedBy(NumberSupplier.class) Number num2
			) {
		Adder anAdder = new Adder();
		double expectedSum = num1.doubleValue() +num2.doubleValue();
		double actualResult = (Double)anAdder.add(num1, num2);
		Assert.assertEquals(expectedSum,actualResult,0.01);
	}
	
	
	@Theory
	public void add_String(
			@ParametersSuppliedBy(StringSupplier.class) String str1,
			@ParametersSuppliedBy(StringSupplier.class) String str2
			) {
		
		      System.out.println("str1 + str2 = " + str1 + " + " + str2 + " = " + str1+str2);
	}
	
	@Theory
	public void add_String_test(
			@ParametersSuppliedBy(StringSupplier.class) String str1,
			@ParametersSuppliedBy(StringSupplier.class) String str2
			) {
		Adder anAdder = new Adder();
		String expectedStr = str1 + str2;
		String actualResult = (String)anAdder.add(str1, str2);
		Assert.assertEquals(expectedStr,actualResult);
	}
}
