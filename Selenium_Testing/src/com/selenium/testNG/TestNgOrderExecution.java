package com.selenium.testNG;

import org.testng.annotations.Test;

//@Test ANNOTATION EXECUTION OF ORDER IS ALPHABETICALLY WHICH COME FIRST I.E. ASCENDING ORDER  
public class TestNgOrderExecution {
	@Test
	public void m() {
		System.out.println("hi this is m method ");
	}
	@Test(enabled =false )
	public void d() {
		System.out.println("hi this is Dm method ");
	}
	@Test(enabled=true)
	public void c() {
		System.out.println("hi this is C method ");
	}
	@Test
	public void v() {
		System.out.println("hi this is V method ");
	}
	@Test
	public void z() {
		System.out.println("hi this is Z method ");
	}
	

}
