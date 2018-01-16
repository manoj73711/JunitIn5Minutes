package com.syntel.math.JunitIn5Minutes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {
	
	@BeforeClass
	public static void beforeClass_method() {
		System.out.println("Before Class");
	}
	@AfterClass
	public static void afterClass_method() {
		System.out.println("After class is executed");
	}
	//Before Method executes after every Method 
	@Before
	public void before_Method() {
		System.out.println("Before");
	}
	//After Method executes after executing the every method
	@After
	public void after_Method() {
		System.out.println("After");
	}
	@Test
	public void sumNumbers_with3Numbers() {
		System.out.println("Test1");
		MyMath math = new MyMath();
		assertEquals(11, math.sumNumbers(new int[] { 2, 4, 5 }));
	}

	@Test
	public void sumNumbers_with1Numbers() {
		System.out.println("Test2");
		MyMath math = new MyMath();
		assertEquals(2, math.sumNumbers(new int[] {2}));
	}
}
