package com.demoo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.demo.Base_Class;

public class Project_Maven extends Base_Class {

	public static void main(String[] args) throws IOException {

		getDriver();
		maxi();
		getUrl("https://www.facebook.com/login/");

		WebElement findElement = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		inputValue(findElement, "JASWIN PAUL");

		WebElement findElement2 = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		inputValue(findElement2, "12345");
		
screenShot("paul.png");


		WebElement findElement3 = driver.findElement(By.xpath("//button[@value=\"1\"]"));
		clickOnElement(findElement3);
		
navigate();


}
	
}
