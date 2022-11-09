package org.day02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task09 {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.edge", 
				"C:\\Users\\WIN\\eclipse-workspace\\001selenium\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txtfristname = driver.findElement(By.xpath("//input[@type='text']"));
		txtfristname.sendKeys("muthu");
		
		WebElement txtsecondname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtsecondname.sendKeys("ram");
		
		WebElement txtaddress = driver.findElement(By.xpath("//textarea[@rows=\"3\"]"));
		txtaddress.sendKeys("bnbn kjgo jhfosdfuy kjsdfo");
		
		WebElement txtemail = driver.findElement(By.xpath("//input[@type=\"email\"]"));
		txtemail.sendKeys("muthu87@gmail.com");
		
		WebElement txtph = driver.findElement(By.xpath("//input[@type=\"tel\"]"));
		txtph.sendKeys("986775644");
		
		WebElement radiobtn = driver.findElement(By.xpath("//input[@value=\"Male\"]"));
		radiobtn.click();
		
		WebElement choose = driver.findElement(By.id("checkbox1"));
		choose.click();
		
		WebElement choose2 = driver.findElement(By.id("checkbox2"));
		choose2.click();
		
		WebElement choose3 = driver.findElement(By.id("checkbox3"));
		choose3.click();
		
		WebElement lang = driver.findElement(By.id("msdd"));
		lang.click();
		
		
		WebElement skills = driver.findElement(By.id("Skills"));
		Select s = new Select(skills);
		s.selectByValue("Java");
		WebElement country = driver.findElement(By.xpath("//span[@role=\"presentation\"]"));
		country.click();
		WebElement txtcountry = driver.findElement(By.xpath("//input[@type=\"search\"]"));
		txtcountry.sendKeys("india",Keys.ENTER);
		
		WebElement year = driver.findElement(By.id("yearbox"));
		Select s1 = new Select(year);
		s1.selectByValue("2001");
		
		WebElement month = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		Select s2 = new Select(month);
		s2.selectByValue("May");
		
		WebElement day = driver.findElement(By.id("daybox"));
		Select s3 = new Select(day);
		s3.selectByValue("15");
		
		WebElement txtpassword = driver.findElement(By.id("firstpassword"));
		txtpassword.sendKeys("mut8653");
		

}}
