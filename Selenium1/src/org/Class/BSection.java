package org.Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium1\\driver\\msedgedriver.exe");
WebDriver driver = new EdgeDriver();
driver.navigate.to("//https:www.facebook.com/");
}

}
