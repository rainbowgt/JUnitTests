package edu.ecnu.sei.junit.recap;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class TestNameRuleTest {

	@Rule
	public TestName name = new TestName();
	
	@Test
	public void test_1() {
		assertEquals("test_1",name.getMethodName());
	}
	
	@Test
	public void test_2() {
		assertEquals("test_2",name.getMethodName());
	}
}
