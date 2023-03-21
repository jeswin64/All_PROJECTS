package com.simple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\Navigate_To\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
driver.get("https://www.facebook.com/login/");

driver.navigate().to("https://www.flipkart.com/");
	}

}
