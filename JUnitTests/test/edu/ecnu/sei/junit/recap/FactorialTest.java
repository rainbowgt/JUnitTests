package edu.ecnu.sei.junit.recap;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.Assert;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;

@DisplayName("A parameterized test case in junit5")
class FactorialTest {

	@ParameterizedTest
	@MethodSource("dataProvider")
	void factorial_test(int number,int expectedResult) throws Exception{
		
		Factorial f = new Factorial();
		Assert.assertEquals(f.factorial(number),expectedResult);
	}	
	
	static Stream<Arguments> dataProvider(){
		return Stream.of(
			  Arguments.of(0,1),
			  Arguments.of(3,16));
		
	}
}


