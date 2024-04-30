package com.selenium.JavaPractice;

// IN THIS EXAMPLE WE SEEE STATIC VARIAVLWE AND STATIC METJHOD NEVER INHERITED IN SUB CLLASS

class A{
	static int i=10;
	public static void add() {
		int sum=10+i;
		System.out.println("sum of sum+ i is :"+sum);
	}
}

class B extends A{
	
}

public class TestInher extends A {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInher tn=new TestInher();
		tn.add();
		System.out.println("value of static variable i from A class "+i);
		add();

	}

}
