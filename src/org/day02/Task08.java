package org.day02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task08 {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.edge", 
				"C:\\Users\\WIN\\eclipse-workspace\\001selenium\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page \r\n" + 
				"");
		WebElement txtusername = driver.findElement(By.name("username"));
		txtusername.sendKeys("muthu");
		
		WebElement txtpassword = driver.findElement(By.name("password"));
		txtpassword.sendKeys("7598375");

}}
