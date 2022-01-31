package com.practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
	@Test
	public void f() {
		System.out.println("I am General Method");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am Before Method");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am After Method");

	}

}
