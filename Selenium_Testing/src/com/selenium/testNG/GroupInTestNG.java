package com.selenium.testNG;

import org.testng.annotations.Test;

public class GroupInTestNG {
	
	@Test(groups="sanity")
	public void sanity() {
		System.out.println("this is SANITY testing");
		
	}
	@Test(groups={"regration","smoke"})
	public void regration() {
		System.out.println("this is REGRESSION testing");
		
	}
	@Test(groups={"functional","smoke"})
	public void functional() {
		System.out.println("this is FUNCTIONASL testing");
		
	}
	@Test(groups="smoke")
	public void smoke() {
		System.out.println("this is SMOKE testing");
		
	}
	@Test(groups="functionaltest")
	public void fuctionalTestCase() {
		System.out.println("this is FUNCTIONALTESTCASE testing");
		
	}
	
	@Test
	public void testingfunction() {
		System.out.println("this is FUNCTIONALTESTCASE testing");
		
	}
	

}
