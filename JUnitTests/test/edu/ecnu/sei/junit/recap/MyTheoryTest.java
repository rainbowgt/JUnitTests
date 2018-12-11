package edu.ecnu.sei.junit.recap;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;


@RunWith(Theories.class)
public class MyTheoryTest {
	
	@DataPoint public static String Name = "Sun";
	@DataPoint public static String Mike = "Mike";
	@DataPoints public static char[] mid = new char[] {'A','B','C'};
	

	@Theory
	public void sanity(String firstName,String lastName) {
		
		System.out.println("Sanity Check Full Name:" + firstName + ", " + lastName);				
	}
	
	@Theory
	public void sanity_fullName(String firstName,char middleName, String lastName) {
		
		System.out.println("Sanity Check Full Name:" + firstName +", "+ middleName +", " + lastName);				
	}
}




/*@DataPoints public static int[] scores = {60,50,0};


@Theory
public void build(int s1,int s2) {
	System.out.println("s1 = " + s1 + "," + "s2 = " + s2 );
}*/