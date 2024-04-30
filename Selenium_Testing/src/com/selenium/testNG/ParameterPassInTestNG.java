package com.selenium.testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class ParameterPassInTestNG {
	
	//Taking paramenter usiing optional paramenter 
	@Test
	public void signup(@Optional("diwakar") String name, @Optional("Diw@1234")  String password) {
		System.out.println("name	 :"+name);
		System.out.println("Password	:"+password);
	
		}
	
	//Takinbg parameter value by Parameter annotaation @Parameter throug the xml file
	@Test
	@org.testng.annotations.Parameters({"fname","lname"})
	public void logIN(String firstName, String lastName) {
		System.out.println("Firsat Name is  :"+firstName);
		System.out.println("Last Name is      :"+lastName);
	}

}
