package edu.ecnu.sei.junit.recap;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExpectedExceptionRuleTest {
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void throws_Nothing() {
		
	}
	
	@Test
	public void throws_NullPointerException() {
		thrown.expect(NullPointerException.class);
		throw new NullPointerException();
	}
	
	@Test
	public void throws_IllegalStateException_With_Message() {
		
		  thrown.expect(IllegalStateException.class);
	      thrown.expectMessage("Is this a legal state?");
	      throw new IllegalStateException("Is this a legal state?");  
	}
	
	@Test
	public void throws_IllegalStateException_With_Message_Fail() {
		
		  thrown.expect(IllegalStateException.class);
	      thrown.expectMessage("Is this a legal state?");
	      throw new IllegalStateException("Is this a legal state");  
	}
}

