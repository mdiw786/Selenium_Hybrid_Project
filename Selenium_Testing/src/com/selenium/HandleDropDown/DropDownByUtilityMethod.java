package com.selenium.HandleDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownByUtilityMethod {
	
	void selectDropDownUsingIndex(WebElement dropdown, int index) {
		new Select(dropdown).selectByIndex(index);
	}
	void selectDropDownUsingVisibleText(WebElement dropdown, String visibleTxt) {
		new Select(dropdown).selectByVisibleText(visibleTxt);
	}
	void selectDropDownUsingValue(WebElement dropdown, String value) {
		new Select(dropdown).selectByValue(value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//open facebook page 
		driver.get("https://www.facebook.com/");
		//open signup page of facebook by clicking linkText  
		driver.findElement(By.linkText("Sign Up")).click();
		
		//finds element for select the dropdown value
		
		WebElement dd = driver.findElement(By.name("birthday_day"));			//for finding the date dropdown list 	
		WebElement mm = driver.findElement(By.name("birthday_month"));			//for finding the month dropdown list 
		WebElement yy = driver.findElement(By.name("birthday_year"));			//for finding the year dropdown list
		
		//create object for calling the selectDropDOwnUsingIndex() method
		DropDownByUtilityMethod drpdwn=new DropDownByUtilityMethod() ;
		//CALLING MEHTOD selectDropDOwnUsingIndex method  and slecting the dropdown value by index 
		drpdwn.selectDropDownUsingIndex(dd, 1);
		drpdwn.selectDropDownUsingIndex(mm, 1);
		drpdwn.selectDropDownUsingIndex(yy, 1);
		
		//CALLING MEHTOD selectDropDOwnUsingIndex method  and selecting the dropdown value by VisibleText 
		drpdwn.selectDropDownUsingVisibleText(dd, "3");
		drpdwn.selectDropDownUsingVisibleText(mm, "Apr");
		drpdwn.selectDropDownUsingVisibleText(yy, "2005");
		

	}

}
