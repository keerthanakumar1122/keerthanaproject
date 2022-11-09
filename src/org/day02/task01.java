package org.day02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class task01 {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.edge", 
				"C:\\Users\\WIN\\eclipse-workspace\\001selenium\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/ ");
		
		WebElement Username = driver.findElement(By.name("email"));
		Username.sendKeys("muthu");
		
		WebElement Password = driver.findElement(By.name("pass"));
		Password.sendKeys("93498");

		
		
	}
	

}
