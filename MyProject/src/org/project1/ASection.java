package org.project1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ASection {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement element =driver.findElement(By.xpath("//input[@type='text']"));
		
	
		//WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	//	WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		//pass.sendKeys("123456789");
		Actions ac = new Actions (driver);
		element.sendKeys("JAva");
		Thread.sleep(3000);
		
		element.getText();
	//Robot r = new Robot();
	//r.keyPress(KeyEvent.VK_DOWN);
	//r.keyRelease(KeyEvent.VK_DOWN);
//	
	}
}

