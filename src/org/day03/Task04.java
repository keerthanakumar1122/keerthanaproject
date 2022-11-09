package org.day03;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task04 {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.edge", 
				"C:\\Users\\WIN\\eclipse-workspace\\001selenium\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(" http://toolsqa.com/automation-practice-form/\r\n" + 
				"");
		WebElement btnclick = driver.findElement(By.xpath("//a[text()='Go back to Homepage']"));
		btnclick.click();
		
		WebElement accept = driver.findElement(By.id("accept-cookie-policy"));
		accept.click();

		WebElement btnclick2 = driver.findElement(By.xpath("//a[@class=\"btn btn-primary-shadow btn-block\"]"));
		btnclick2.click();
		
		WebElement txtname = driver.findElement(By.name("firstName"));
		txtname.sendKeys("muthu");
		
		WebElement txtlastname = driver.findElement(By.name("lastName"));
		txtlastname.sendKeys("ram");
		
		WebElement txtemail = driver.findElement(By.name("email"));
		txtemail.sendKeys("mutnu@gmail.com");
		
		WebElement txtmoblie = driver.findElement(By.name("mobile"));
		txtmoblie.sendKeys("6785726792");
		
		WebElement country = driver.findElement(By.name("country"));
		Select s = new Select(country);
		s.selectByVisibleText("India");
		
		WebElement txtcity = driver.findElement(By.name("city"));
		txtcity.sendKeys("tirupur");
		
		WebElement txtmessage = driver.findElement(By.name("message"));
		txtmessage.sendKeys("i'm going to chennai");
		
		
		
		
		
		
}}
