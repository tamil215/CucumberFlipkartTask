package com.flipkart.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.objectrepository.Validation;
import com.flipkartresources.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobileValidationSteps extends CommonActions {
	CommonActions c = new CommonActions();
	Validation v = new Validation();
	String name="";
	static WebDriver driver;
	
	@Given("User launches flipkart application")
	public void user_launches_flipkart_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println("login");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		v.getClose().click();
	
	}
		
	@When("User search mobile")
	public void user_search_mobile(String string) throws Exception {
		name=string;
		c.searching_mobile(v.getSearch(), name);
		c.taking_Mobile_list(name, v.getProduct(), v.getProductPrice());
		c.selecting_Mobile(v.getFilter(), v.getProduct().get(0));
	   
	}
	@When("User handles windows handling")
	public void user_handles_windows_handling() {
	c.windows_Handling();

		
	}

	@When("User select the mobile and check radio buttons")
	public void user_select_the_mobile_and_check_radio_buttons() throws Exception {
		c.user_doing_Validation(name, v.getProductName().getText(), v.getProductPrice());
		c.buying_the_mobile(v.getAvailable(), v.getBuynow());
		c.radio_button_check(v.getRadio1(), v.getRadio2(), v.getPin(), v.getNV());
		Thread.sleep(5000);
		v.getClose().click();
		Thread.sleep(5000);
		v.getCancel().click();
		Thread.sleep(3000);
		v.getCart().click();

	}

	@When("User check delivery details and price details")
	public void user_check_delivery_details_and_price_details() throws Exception {
		c.delivery_Details(v.getDeliveryby());
		c.pricedetails(v.getPricedetails(), v.getPrices(), v.getAmts(), v.getDisprice());
		
	}

	@Then("User closes application")
	public void user_closes_application() {
		driver.close();
	  
	}


	
}
