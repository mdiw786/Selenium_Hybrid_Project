package com.selenium.testNG;

import org.testng.annotations.Test;

public class MethodDisableInTestNG {
	
	
	@Test
	public void test1() {
		System.out.println("test1() method ");
	}
	
	@Test
	public void test2() {
		System.out.println("test2() method ");
	}
	
	@Test(enabled = false)
	public void test3() {
		System.out.println("test3() method ");
	}
	
	@Test(enabled = true)
	public void test4() {
		System.out.println("test4() method ");
	}

}
