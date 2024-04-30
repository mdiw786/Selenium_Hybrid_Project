package com.selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(5000);
		/*
		 * driver.manage().window().maximize(); WebElement day =
		 * driver.findElement(By.name("birthday_day")); WebElement month =
		 * driver.findElement(By.xpath("select[@name='birthday_month']")); WebElement
		 * year = driver.findElement(By.name("select[@name='birthday_year']")); Select
		 * birth_day = new Select(day); Select birth_month = new Select(month); Select
		 * birth_year = new Select(year); //birth_day.selectByValue("23");
		 * birth_day.selectByIndex(22);
		 */
		
		
		//Thread.sleep(5000);
	//	driver.findElement(by.)
		driver.close();
	}

}
