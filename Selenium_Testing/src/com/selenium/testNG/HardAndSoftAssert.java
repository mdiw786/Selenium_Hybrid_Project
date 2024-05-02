package com.selenium.testNG;

import org.checkerframework.common.reflection.qual.NewInstance;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test
public class HardAndSoftAssert {
	
	
	public void hardAssert() {
		System.out.println("statment before the hard assert 1");
		Assert.assertEquals("Manoj", "Manoj");
		System.out.println("statment after hard assert is passed");
		
		
	}
	
	public void hardAssert2() {
		System.out.println("statment before the hard assert 2");
		Assert.assertEquals("Manoj", "Diwakar");
		System.out.println("statment after hard assert is failed");
	}
	
	
	public void softAssert1() {
		System.out.println("statment before the soft assert");
		SoftAssert softAssert=new SoftAssert();
		 //softAssert.assertEquals("Manoj", "Manoj");
		System.out.println("statment after soft assert is passed ");
		
		System.out.println("Now Next statement is failed but after the statment failed next statment will be executed every time");
		 softAssert.assertEquals("Manoj", "mnoj");
		 System.out.println("statment after soft assert is failed ");
			
		 
	}
	
	
	
	

}
