package org.day03;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task06 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.edge", 
				"C:\\Users\\WIN\\eclipse-workspace\\001selenium\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(" https://www.redbus.in/");
		
		WebElement btnsgin = driver.findElement(By.id("signin-block"));
		btnsgin.click();
		
		WebElement btnsgin2 = driver.findElement(By.id("hc"));
		btnsgin2.click();
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class=\"modalIframe\"]"));
		driver.switchTo().frame(iframe);
		WebElement txtmoblie = driver.findElement(By.id("mobileNoInp"));
		txtmoblie.sendKeys("9834095835");
		

}}
