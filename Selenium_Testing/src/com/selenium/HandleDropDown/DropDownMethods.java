// THIS PROGRAM IS USED FOR 
				// GET THE VALUE ALREADY SELECTED or cureent selected IN DROPDOWN LIST 	BY USING METHODS
				// AND PRINT ALL THE DROP DOWN LIST OF VALUES 
			 
// METHODS USED IN THIS PROGRAM
// getFirstSelectedOption()

package com.selenium.HandleDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//open facebook page 
		driver.get("https://www.facebook.com/");
		//open signup page of facebook by clicking linkText  
		driver.findElement(By.linkText("Sign Up")).click();
		
		Select sel=new Select(driver.findElement(By.name("birthday_day")));
		
		//SELECTING ELEMENT BEFORE THE SELECT ANY OPTIONS 
		WebElement befor_Select = sel.getFirstSelectedOption();
		System.out.println(" get text before the selecting drop down list"+befor_Select.getText());
		
		//select the element from drop down by visible text
		sel.selectByVisibleText("3");
		WebElement after_Select = sel.getFirstSelectedOption();
		System.out.println(" get text before the selecting drop down list"+after_Select.getText());
		
		
		
		// TO FETCH / RETRIEW ALL THE DROP DOWN WEB ELEMENT AND STORE IN A LIST 
		List<WebElement> list = sel.getOptions();
		for(int i=0;i<list.size();i++) {
			//  String s=list.get(i).getText();
		//  	System.out.println(s);
		//	System.out.println(list.get(i).getText());					//it prints one by one list elements
			
			if(list.get(i).getText().equals("10")) {
				System.out.println(list.get(i).getText());
				break;
				
			}
			
		}
		
		
		
	}

}
