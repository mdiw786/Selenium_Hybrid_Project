package com.selenium.testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPassByOptionalClassLevel {
	
	
	//its for claass levele execution if we pass parameter through the xml then its not working optional value
	@Test
	@Parameters({"fname", "lname"})
	public void parameterOptionalPass(@Optional("diwakr") String name, @Optional("Bhasjar") String lname) {
		System.out.println("Name is ="+name);
		System.out.println("last name is = "+lname);
	}

}
