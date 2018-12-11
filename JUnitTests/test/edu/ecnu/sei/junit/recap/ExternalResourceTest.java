package edu.ecnu.sei.junit.recap;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;
import org.junit.rules.TestName;

public class ExternalResourceTest {
	
	Resource resource;
	
	public @Rule TestName name = new TestName();
	
	public @Rule ExternalResource rule = new ExternalResource() {
	
		@Override protected void before() throws Throwable{
			resource = new Resource();
			resource.open();
		}
		
		@Override protected void after() {
			resource.close();
			System.out.println("\n");
		}
	};
	
	@Test
	public void test_1() throws Exception{
		
	}
	
	@Test
	public void test_2() throws Exception{
	
	}
}

