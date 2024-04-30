package com.selenium.HandleDropDown;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBySelect {

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
		
		
		// FOR SELECTING THE DATE FROMJ THE DROP DOWN LIST 
		Select date = new Select(dd);											//handle the date by create select	class obj	
		Select month=new Select(mm);											//hanndle the month 
		Select year=new Select(yy);											//handle year 
		
		
		//select the value by index
//		date.selectByIndex(3);						//for select the date based on the index
//		month.selectByIndex(5);
//		year.selectByIndex(2);
		
		
		//SELECT THE VALUE based on  VISIBLEtEXT
//		date.selectByVisibleText("16");
//		month.selectByVisibleText("May");
//		year.selectByVisibleText("2006");
		
		
		//SELECT THE VALUE BASED ON VALUE tag attribute
		date.selectByValue("29");
		month.selectByValue("12");
		year.selectByValue("1939");
		WebDriver driver1=new WebDriver() {

			@Override
			public void close() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public WebElement findElement(By by) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public List<WebElement> findElements(By by) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void get(String url) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public String getCurrentUrl() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getPageSource() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getTitle() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getWindowHandle() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Set<String> getWindowHandles() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Options manage() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Navigation navigate() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void quit() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public TargetLocator switchTo() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		

}

}
