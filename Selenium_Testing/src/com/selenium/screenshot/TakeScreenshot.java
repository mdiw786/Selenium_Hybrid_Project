package com.selenium.screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
	 WebDriver driver;
	
	
	
	//TAKING THE SCREENSHOT ACCORDING TO CURRENT TIME +WINDOWHAND NAME AS SUFFIX
	static void takeScreenShot(WebDriver driver) throws IOException {
		
		TakesScreenshot sc= (TakesScreenshot) driver;
		File src= sc.getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(src,new File("./screenshot/"+System.currentTimeMillis()+"windowHand.png"));
		
	}
	
	// TAKING THE SCREEENSHOT WITH DIFFERENT NAME BY PASSING ARGUMENT 
	static void takeScreenShot(WebDriver driver, String sc_name) throws IOException {
		TakesScreenshot sc=(TakesScreenshot) driver;
		File src=sc.getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(src, new File("./screenshot/"+sc_name+".png"));
		
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 //takeing screenshot with differen parameter
		 takeScreenShot(driver);
		 takeScreenShot(driver, "OPENHRM_hOME");
		 String parentWindowID = driver.getWindowHandle();
		 System.out.println(driver.getTitle()+" &&&&&&&&&  "+driver.getCurrentUrl());
		 System.out.println("Parent window id "+parentWindowID);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']")).click();
		 takeScreenShot(driver);
		 takeScreenShot(driver, "Orangehrm_FB_Link");
		 Set<String> windows = driver.getWindowHandles();
		 for(String win:windows) {
			System.out.println(win);
		 }
		 

	}

}
