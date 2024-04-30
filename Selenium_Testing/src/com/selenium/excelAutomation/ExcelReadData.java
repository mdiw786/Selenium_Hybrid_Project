package com.selenium.excelAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadData {
	
	

	public static void main(String[] args) throws FileNotFoundException, IOException{
File fl= new File("C:\\Users\\hp\\Desktop\\ExcelAutomation.xlsx");
FileInputStream fis=new FileInputStream(fl);
 XSSFWorkbook ws = new XSSFWorkbook(fis);
//XSSFSheet sheet= ws.getSheet("Sheet3");
 XSSFSheet sheet=ws.getSheet("Sheet3");
int countRow=sheet.getLastRowNum();
System.out.println("totakl row count "+countRow);
//int countrow=sheet.getLastRowNum();
//System.out.println("last row no "+countrow);
XSSFRow row=sheet.getRow(1);

XSSFCell r1c0=row.getCell(0);
String sno=r1c0.getStringCellValue();

XSSFCell r1c1=row.getCell(1);
String fname=r1c1.getStringCellValue();

XSSFCell r1c2=row.getCell(2);
String lname=r1c2.getStringCellValue();

XSSFCell r1c3=row.getCell(3);
String add=r1c3.getStringCellValue();

XSSFCell r1c4=row.getCell(4);
String mob=r1c4.getStringCellValue();

System.out.println(sno+"       "+fname+"     "+lname+"      "+add+"    "+mob);






	}

}
