package com.selenium.JavaPractice;

class Parent {
	protected void add() {
		//int sum = a + b;
		System.out.println("from parent class add method" );
	}
}

class SubClassParent extends Parent {
	protected void add() {
		super.add();
		System.out.println("from SubClassParent class add method	");
		//return sum;
	}

}

public class PolyMorphismOverride extends SubClassParent {
	
	public static void main(String args[]) {
		PolyMorphismOverride pm=new PolyMorphismOverride();
		pm.add();
		//PolyMorphismOverride pm2=(PolyMorphismOverride) new Parent();
		//pm2.add();
		System.out.println();
	}

}
