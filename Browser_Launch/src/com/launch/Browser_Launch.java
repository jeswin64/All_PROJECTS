package com.launch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Browser_Launch {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\Browser_Launch\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions as = new Actions(driver);
		Robot rb = new Robot();
		driver.get("https://adactinhotelapp.com/");

		WebElement findElement = driver.findElement(By.xpath("//input[@class=\"login_input\"]"));
		as.click(findElement).sendKeys("jeswin123").build().perform();

		WebElement findElement1 = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		as.click(findElement1).sendKeys("Jeswin07").build().perform();

		WebElement findElement2 = driver.findElement(By.xpath("//input[@class=\"login_button\"]"));
		as.click(findElement2).build().perform();

		
		WebElement findElement3 = driver.findElement(By.xpath("//select[@class=\"search_combobox\"]"));
		as.click(findElement3).build().perform();
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyRelease(KeyEvent.VK_DOWN);	
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyRelease(KeyEvent.VK_DOWN);
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyRelease(KeyEvent.VK_DOWN);
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyRelease(KeyEvent.VK_DOWN);
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyRelease(KeyEvent.VK_DOWN);
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyRelease(KeyEvent.VK_DOWN);
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);

WebElement findElement4 = driver.findElement(By.xpath("//select[@name=\"hotels\"]"));
as.click(findElement4).build().perform();
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyRelease(KeyEvent.VK_DOWN);	
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);

WebElement findElement5 = driver.findElement(By.xpath("//select[@name=\"room_type\"]"));
as.click(findElement5).build().perform();
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyRelease(KeyEvent.VK_DOWN);	
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);

WebElement findElement6 = driver.findElement(By.xpath("//select[@name=\"room_type\"]"));
as.click(findElement6).build().perform();
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);


WebElement findElement7 = driver.findElement(By.xpath("//select[@id=\"room_nos\"]"));
as.click(findElement7).build().perform();

rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);




WebElement findElement8 = driver.findElement(By.xpath("//input[@name=\"datepick_in\"]"));
as.click(findElement8).build().perform();
rb.keyPress(KeyEvent.VK_CONTROL);
rb.keyPress(KeyEvent.VK_A);
rb.keyPress(KeyEvent.VK_BACK_SPACE);
rb.keyRelease(KeyEvent.VK_BACK_SPACE);
rb.keyRelease(KeyEvent.VK_A);
rb.keyRelease(KeyEvent.VK_CONTROL);
findElement8.sendKeys("10/03/2023");


WebElement findElement9 = driver.findElement(By.xpath("//input[@name=\"datepick_out\"]"));
as.click(findElement9).build().perform();
rb.keyPress(KeyEvent.VK_CONTROL);
rb.keyPress(KeyEvent.VK_A);
rb.keyPress(KeyEvent.VK_BACK_SPACE);
rb.keyRelease(KeyEvent.VK_BACK_SPACE);
rb.keyRelease(KeyEvent.VK_A);
rb.keyRelease(KeyEvent.VK_CONTROL);
findElement9.sendKeys("11/03/2023");


WebElement findElement10 = driver.findElement(By.xpath("//select[@name=\"adult_room\"]"));
as.click(findElement10).build().perform();
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyRelease(KeyEvent.VK_DOWN);
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);


WebElement findElement11 = driver.findElement(By.xpath("//select[@name=\"child_room\"]"));
as.click(findElement11).build().perform();
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyRelease(KeyEvent.VK_DOWN);	
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);



WebElement findElement12 = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
as.click(findElement12).build().perform();

WebElement findElement13 = driver.findElement(By.xpath("//input[@type=\"radio\"]"));
as.click(findElement13).build().perform();


WebElement findElement14 = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
as.click(findElement14).build().perform();

WebElement findElement15 = driver.findElement(By.xpath("//input[@class=\"reg_input\"]"));
as.click(findElement15).sendKeys("Jeswin").build().perform();

WebElement findElement16 = driver.findElement(By.xpath("//input[@name=\"last_name\"]"));
as.click(findElement16).sendKeys("Paul").build().perform();


WebElement findElement17 = driver.findElement(By.xpath("//textarea[@name=\"address\"]"));
as.click(findElement17).sendKeys("xyxyxyxy").build().perform();

WebElement findElement18 = driver.findElement(By.xpath("//input[@name=\"cc_num\"]"));
as.click(findElement18).sendKeys("2354 6576 7898 6545").build().perform();


WebElement findElement19 = driver.findElement(By.xpath("//select[@class=\"select_combobox\"]"));
as.click(findElement19).build().perform();
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyRelease(KeyEvent.VK_DOWN);
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyRelease(KeyEvent.VK_DOWN);
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);

WebElement findElement20 = driver.findElement(By.xpath("//select[@class=\"select_combobox2\"]"));
as.click(findElement20).build().perform();
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyRelease(KeyEvent.VK_DOWN);
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyRelease(KeyEvent.VK_DOWN);
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);


WebElement findElement21 = driver.findElement(By.xpath("//select[@name=\"cc_exp_year\"]"));
as.click(findElement21).build().perform();
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyRelease(KeyEvent.VK_DOWN);
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyRelease(KeyEvent.VK_DOWN);
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);


WebElement findElement22 = driver.findElement(By.xpath("//input[@name=\"cc_cvv\"]"));
as.click(findElement22).sendKeys("788").build().perform();


WebElement findElement23 = driver.findElement(By.xpath("//input[@name=\"book_now\"]"));
findElement23.click();

WebElement findElement24 = driver.findElement(By.xpath("//input[@name='logout']"));
findElement24.click();
driver.close();














	}
}