package com.FLipkart.stepdefinition;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TvPurchase {
	@BeforeClass
	public static void BeforeClass() {
		System.out.println("Before Class");	
	}
	@AfterClass
	public static void AfterClass() {
		System.out.println("After Class");	
	}
	@Before
	public  void beforeMethod() {
		System.out.println("Before Method");	
	}
	@After
	public  void afterMethod() {
		System.out.println("After Method");	
	}
	@Test
	public void method1() {
		System.out.println("Method 1");
	
	}
	@Test
	public void method2() {
		System.out.println("Method 2");
	
	}
	@Ignore
	@Test
	public void method3() {
		System.out.println("Method 3");
	
	}
	@Ignore
	@Test
	public void method4() {
		System.out.println("Method 4");
	
	}
	@Ignore
	@Test
	public void method5() {
		System.out.println("Method 5");
	
	}

}
