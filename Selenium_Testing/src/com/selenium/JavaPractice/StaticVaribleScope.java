package com.selenium.JavaPractice;

public class StaticVaribleScope {
	static int a;
	int b=10;
	int c;
	boolean df;
	String s;
	 static void aceessA() {
		 int c=10;
		System.out.println("value ofd a is "+a);
		// non static variable can not acees in static method 
		//System.out.println("value ofd a is "+b);
		System.out.println("value of c is "+c);
	}
	 
	void add()
	{
		
		System.out.println("from add methods "+b);
		System.out.println("from add methods default value of c is  "+c);
		System.out.println("by default boolean vbalue   "+df);
		System.out.println("by default boolean vbalue   "+s);
		
	}
	
	
	public static void main(String args[])
	{
		int b=10;
		System.out.println("	call from main method "+a);
		aceessA();
		StaticVaribleScope sc=new StaticVaribleScope();
		sc.add();
		
	}

}
