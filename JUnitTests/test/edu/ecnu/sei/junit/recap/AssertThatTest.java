package edu.ecnu.sei.junit.recap;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AssertThatTest {
	
	@Test
	public void verify_Matcher() throws Exception{
		
		int age = 30;
		//int age = 29;
		
		assertThat(age,equalTo(30));
		assertThat(age,not(equalTo(33)));
		
	}	

}
