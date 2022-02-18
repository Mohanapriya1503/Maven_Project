package com.Mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {

	private static void write_Data() throws IOException {
		
		File f = new File("C:\\Users\\mohanapriya R\\eclipse-workspace\\Mavenproject\\Excel\\Book1.xlsx");

		FileInputStream fs =new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fs);
		
		wb.createSheet("DataS").createRow(0).createCell(0).setCellValue("Username");
		
		wb.getSheet("DataS").getRow(0).createCell(1).setCellValue("password");
		
		wb.getSheet("DataS").createRow(1).createCell(0).setCellValue("Maven");
		
		wb.getSheet("DataS").getRow(1).createCell(1).setCellValue("23ed");
		
		wb.getSheet("DataS").createRow(2).createCell(0).setCellValue("Java");
		
		wb.getSheet("DataS").getRow(2).createCell(1).setCellValue("235hj");
		
		FileOutputStream fo = new FileOutputStream(f);
		
		wb.write(fo);
		
		System.out.println("data output run successfully");
		
		}
	
	   public static void main(String[] args) throws IOException  {
	
		   write_Data();
		   
		  // System.out.println("data output run successfully");
	}
}






















