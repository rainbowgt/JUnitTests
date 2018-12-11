package edu.ecnu.sei.junit.recap;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;


@FixMethodOrder(MethodSorters.JVM)
public class OrderedTests {
	
	@Test
	public void edit() throws Exception{
		System.out.println("Edit executed");
	}
	
	@Test
	public void create() throws Exception{
		System.out.println("Create exectued");		
	}
	
	@Test
	public void remove() throws Exception{
		System.out.println("Remove executed");
	}

}

