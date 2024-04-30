package com.selenium.testNG;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AssignmentTestNG1 {
	ChromeDriver driver;
	TakesScreenshot sc;
	
	@BeforeTest
	public void lounchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	//use for facebook apage and direct to SignUpo button and signup page is open
	
	@BeforeMethod
	public void facebookPage() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		Thread.sleep(10);
		//open signup page of facebook by clicking linkText  
		driver.findElement(By.linkText("Sign Up")).click();
	}
	@Test
	public void getSignupData() {
		/*
		 * driver.get("https://www.facebook.com/"); //open signup page of facebook by
		 * clicking linkText driver.findElement(By.linkText("Sign Up")).click();
		 */
		driver.findElement(By.name("firstname")).sendKeys("manoj");
		driver.findElement(By.name("lastname")).sendKeys("Diwakar");
		driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("abc@12345");
		new Select(driver.findElement(By.name("birthday_day"))).selectByVisibleText("15");
		new Select(driver.findElement(By.name("birthday_month"))).selectByVisibleText("Feb");
		new Select(driver.findElement(By.name("birthday_year"))).selectByVisibleText("1995");
		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
		
				}
	
	@AfterMethod
	public void screenshot() throws IOException {
		 sc=(TakesScreenshot)driver;
		File src=sc.getScreenshotAs(OutputType.FILE);
		//File trg=new File(".\\screenshot");
		FileHandler.copy(src, new File("./screenshot/a.png"));
	}
	
	@DataProvider(name="SignUpFb")
	public Object[] signUpFbData() {
		Object[] data=new Object[8];
		data[0]="deepak";
		data[1]="diwakar";
		data[2]="abc@gmail.com";
		data[3]="abc@12345";
		data[4]="15";
		data[5]="Feb";
		data[6]="1995";
		
				
		return data;
	}
	
	@AfterTest
	public void closeBrowser() {
		//driver.close();
	}

}
