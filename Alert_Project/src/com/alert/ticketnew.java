package com.alert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ticketnew {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\Alert_Project\\driver\\chromedriver.exe");
		Robot rb = new Robot();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ticketnew.com/");
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Chennai']"));
		findElement.click();
		WebElement findElement2 = driver.findElement(By.xpath("//a[@id=\"href_movies\"]"));
		findElement2.click();

		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
		WebElement findElement3 = driver.findElement(By.xpath("//h4[text()='Agilan (U/A) - Tamil']"));
		findElement3.click();
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(KeyEvent.VK_PAGE_DOWN);

		WebElement findElement4 = driver.findElement(By.xpath("//span[text()='16']"));
		findElement4.click();

		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
		WebElement findElement5 = driver.findElement(By.xpath("//a[@class=\"tn-green tn-tooltip tn-select-seat\"]"));
		findElement5.click();
		
		Actions as = new Actions(driver);
		WebElement findElement6 = driver.findElement(By.xpath("//td[@class=\"tn-seat tn-seat-available tn-seat-selected\"]"));
		as.click(findElement6).build().perform();
		
		
		
		
		

	}

}
//WebElement findElement = driver.findElement(By.xpath(""));
//findElement.click();
//Alert al = driver.switchTo().alert();
//al.accept();
