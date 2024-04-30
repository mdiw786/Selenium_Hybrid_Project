package com.selenium.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		driver.findElement(By.id("superOffersTab_FLIGHTS")).click();
		

	}

}
