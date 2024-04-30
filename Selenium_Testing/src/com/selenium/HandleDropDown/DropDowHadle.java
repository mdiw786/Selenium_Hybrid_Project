package com.selenium.HandleDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowHadle {
	
	//SELECT BY INDEX in WebElement dropdown passes the month, day, year
	public void DropDownUtilityMethod(WebElement dropdown, int index) {
		new Select(dropdown).selectByIndex(index);
		
	}
	//SELECT BY VALUE
	public void DropDownUtilityMethod(WebElement dropdown, String str) {
		new Select(dropdown).selectByVisibleText(str);
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver  driver=new EdgeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		String s=driver.getTitle();
		System.out.println(s);
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(6000);
		String s1=driver.getTitle();
		System.out.println(s1);
		
		WebElement b_day = driver.findElement(By.name("birthday_day"));
		WebElement b_year;
		WebElement b_month = driver.findElement(By.xpath("//select[@id='month']"));
		//WebElement b_month=driver.findElement(By.name("birthday_month"));
		 b_year = driver.findElement(By.name("birthday_year"));
		
		 Select day=new Select(b_day);
		 Select month=new Select(b_month);
		 Select year=new Select(b_year);
		// SELECTING VALUE BY INDEX
		 day.selectByIndex(12);
		month.selectByIndex(2);
		year.selectByIndex(12);
		
		//SELECTING VALUE BY VISISBLE tEXT
		day.selectByVisibleText("3");
		month.selectByVisibleText("Aug");
		year.selectByVisibleText("1990");
		
		//SELECT VALUE BY VALUE TAG
		day.selectByValue("1");
		month.selectByValue("8");
		year.selectByValue("1998");
				
	}

}
