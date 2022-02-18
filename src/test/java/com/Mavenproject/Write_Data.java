package com.Mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	private static void Write_Data() throws Throwable {
		
		File f = new File("C:\\Users\\mohanapriya R\\eclipse-workspace\\Mavenproject\\Excel\\Book1.xlsx");

		FileInputStream fs =new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fs);
		
		wb.createSheet("Data").createRow(0).createCell(0).setCellValue("Username");
		
		wb.getSheet("Data").getRow(0).createCell(1).setCellValue("password");
		
		wb.getSheet("Data").createRow(1).createCell(0).setCellValue("Maven");
		
		wb.getSheet("Data").getRow(1).createCell(1).setCellValue("23ed");
		
		wb.getSheet("Data").createRow(2).createCell(0).setCellValue("Java");
		
		wb.getSheet("Data").getRow(2).createCell(1).setCellValue("235hj");
		
		FileOutputStream fo = new FileOutputStream(f);
		
		wb.write(fo);
		
		wb.close();
		
		
		}
	public static void main(String[] args) throws Throwable {
		
		System.out.println("data output run successfully");
		
		Write_Data();
		
	}

}

