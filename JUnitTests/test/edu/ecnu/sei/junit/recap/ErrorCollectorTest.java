package edu.ecnu.sei.junit.recap;

import org.junit.rules.ErrorCollector;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Test;
import org.junit.Rule;
import static org.junit.Assert.assertThat;


public class ErrorCollectorTest {
	
	@Rule
	public ErrorCollector ec= new ErrorCollector();
	
	@Test
	public void execution_continue_after_first_fail(){
		
		ec.checkThat("a", equalTo("b"));
		ec.checkThat(1, equalTo(2));
	}
	
	
	@Test
	public void execution_stop_after_first_fail() {
		
		assertThat("a", equalTo("b"));
		assertThat(1, equalTo(2));
	}
}

