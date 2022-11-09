package org.day03;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task05 {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.edge", 
				"C:\\Users\\WIN\\eclipse-workspace\\001selenium\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement interviewq = driver.findElement(By.id("heading20"));
		interviewq.click();
		WebElement CTSq = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		CTSq.click();

}}
