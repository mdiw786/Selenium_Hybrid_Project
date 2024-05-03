package com.selenium.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {
	
	//test data giving by the name  of testData given by the @DataProvider annotation 
	@Test(dataProvider = "testData")
	public void getData(Object sname,Object lname, Object sRollNo) {
		System.out.println(sname+"      "+lname+"      "+sRollNo);
		
	}

	
	@DataProvider(name = "testData")
	public Object createTestData() {
		Object[][] obj= new Object[4][3];
		obj[0][0]="RAMESH";
		obj[0][1]="SINGH";
		obj[0][2]=1001;
		
		obj[1][0]="MOHAN";
		obj[1][1]="GUPTA";
		obj[1][2]=1002;
		
		obj[2][0]="RAJNI";
		obj[2][1]="JAIN";
		obj[2][2]=1003;
		
		obj[3][0]="DEEPAK";
		obj[3][1]="SIKARWAR";
		obj[3][2]=1004;
				
		return obj;
	}
	
	
	
	//get  the data by the name of method or testcase name 
	
	@Test(dataProvider = "createTestCaseName")
	public void getDataFromTestCaseName(String name,String lname) {
		System.out.println(name+"        "+lname);
	}
	
	
	@DataProvider
	public String[][] createTestCaseName(){
		String[][] str= {{"vaishali","diwakar"},{"santoshiu", "kumari","ghhoha"},{"kiran","sharma"}};
		return str;
		
	}
	
}
