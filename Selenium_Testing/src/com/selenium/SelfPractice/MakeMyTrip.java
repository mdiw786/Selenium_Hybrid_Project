package com.selenium.SelfPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		//driver.findElement(By.id("superOffersTab_FLIGHTS")).click();
		
		//USE IMPLICIT WAIT TO LOAD ALL THE DOM ELEMENT OF HTML
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id=\"superOffersTab_FLIGHTS\"]/span")).click();
		

	}

}
