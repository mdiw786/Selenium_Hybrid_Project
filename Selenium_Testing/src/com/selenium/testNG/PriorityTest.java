package com.selenium.testNG;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test
	public void test6() {
		//by defauolt priority is 0 if not given in  test annotatoion
		System.out.println("test6() method  without priority given ");
	}
	
	@Test(priority =4 )
	public void test()
	{
		System.out.println("test() method priotity given 4");
	}
	
	@Test(priority = -2)
	public void  test1() {
		System.out.println("test1() method priority given -2");
	}
	@Test(priority = 2)
	public void test2() {
		System.out.println("test2() method priority given 2");
	}
	@Test(priority = 0)
	public void test3() {
		System.out.println("test3() method priority given 0");
	}
	@Test(priority = -1)
	public void test4() {
		System.out.println("test4() method priority given -1");
	}
	
	@Test(priority = 1)
	public void test5() {
		System.out.println("test5() method priority given 1");
	}

}
