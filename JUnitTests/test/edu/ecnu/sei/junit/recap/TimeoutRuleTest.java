package edu.ecnu.sei.junit.recap;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;

public class TimeoutRuleTest {
	
	@Rule
	public Timeout globalTimeout = new Timeout(200,TimeUnit.MILLISECONDS);
	
	@Test
	public void Finite_Loop() throws InterruptedException{
		Thread.sleep(100);
	}
	
	
	@Test
	public void Infinite_Loop1() throws InterruptedException{
		Thread.sleep(300);
	}
	
	@Test
	public void Infinite_Loop2() throws InterruptedException{
		Thread.sleep(500);
	}
}


