package com.selenium.JavaPractice;

public class Static_NonStaticScope {
	static int a;
	int b;
	
	static void staticVar() {
		int l;
		System.out.println(a);
	//	System.out.println("value of l inside the stticVar method "+l);
		//System.out.println(b);
		
	}
	void nonStaticVar() {
		System.out.println("by default value of non static int is "+b);
		System.out.println(a);
	}
	static {
		System.out.println("static block ");
	}

	public static void main(String[] str) {
		Static_NonStaticScope.staticVar();
		Static_NonStaticScope st= new Static_NonStaticScope();
		st.nonStaticVar();
		
		
	}
}
