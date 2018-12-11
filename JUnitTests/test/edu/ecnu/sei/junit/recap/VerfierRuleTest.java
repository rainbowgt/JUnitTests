package edu.ecnu.sei.junit.recap;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Verifier;
import org.junit.Assert;

public class VerfierRuleTest {
	
	private String errorMsg = null;
	
	@Rule
	public TestRule rule = new Verifier() {
	
	protected void verify() {
		Assert.assertNull("ErrorMsg should be null after each test execution", errorMsg);
	 }
	};
	
	@Test
	public void verifier_fail() throws Exception{
		errorMsg = "Giving a value";
	}
	
	
	@Test
	public void verifier_pass() throws Exception{
		
	}
	

}
