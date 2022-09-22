package com.flipkart.stepdefinition;

import java.time.LocalTime;

import org.junit.After;
import org.junit.Before;

import com.flipkartresources.CommonActions;

public class Hooks extends CommonActions{
	
	CommonActions c = new CommonActions();
	@Before
	public void beforeScene()
	{
		LocalTime now = java.time.LocalTime.now();
		System.out.println("Starts testing at: " +now);
		c.launching_flipkart_application_for_purchase("https://www.flipkart.com/");
	}

	@After
	public void afterScene()
	{
		LocalTime now = java.time.LocalTime.now();
		System.out.println("Ends testing at: " +now);
	}
}
