package com.practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest1 {
	
	@Test(priority=1)
	 public void b_method(){
	    System.out.println("B Method");
	  }

	@Test(priority=2)
	 public void a_method(){
	    System.out.println("A method");
	 }
	
	
	@Test  
	@Parameters({"a","b"})  
	public void add(int c, int d)  
	{  
	int sum=c+d;  
	System.out.println("Sum of two numbers : "+sum);  
	}  

}
