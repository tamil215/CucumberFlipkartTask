package org.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click() ;
		//WebElement login= driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		//Actions a = new Actions (driver);
		//a.moveToElement(login).perform();
		WebElement user= driver.findElement(By.xpath("//input[@id='email']"));
		user.sendKeys("Selenium");
		Thread.sleep(3000);
		
		Actions a = new Actions (driver);
		
		a.contextClick(user);
		
	}

}
