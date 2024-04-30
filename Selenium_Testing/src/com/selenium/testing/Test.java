package com.selenium.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		driver.navigate().to("https://mail.google.com/mail/u/0/?tab=rm&ogbl");
		//WebDriver.TargetLocator.switchTO("https://mail.google.com/mail/u/0/?tab=rm&ogbl");
		//driver.close();
		driver.quit();
	}

}
