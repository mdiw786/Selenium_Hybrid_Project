package com.selenium.SelfPractice;

public class StaticTest {
	static int s=3;
	int c=0;
	StaticTest(){
		s++;
		c++;
		System.out.println("static value of s is : "+s+"\nnon static variable c value is : "+c);
	}
	 void m() {
		c=c+3;
		s=s+6;
		System.out.println(" from m() metod static value of s is : "+s+"\nnon static variable c value is : "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticTest st=new StaticTest();
		StaticTest st1=new StaticTest();
		new StaticTest().m();
		
		

	}

}
