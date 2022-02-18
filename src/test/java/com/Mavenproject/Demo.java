package com.Mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Demo  {
	
	public static void Data() throws IOException {
		
	
	
	File f = new File("C:\\Users\\mohanapriya R\\OneDrive\\Desktop\\DataDriven1.xlsx");
	
	FileInputStream fs =new FileInputStream(f);
	
	Workbook w=new XSSFWorkbook(fs);
	
	Sheet s = w.getSheetAt(0);
	
	Row r = s.getRow(2);
	
	Cell c = r.getCell(1);
	
	CellType cellType = c.getCellType();
	
	if (cellType.equals(CellType.STRING)) {
		
		String stringCellValue = c.getStringCellValue();	
		
        System.out.println(stringCellValue);	
	
	}
	
	else if (cellType.equals(CellType.NUMERIC)) {
		
		double value = c.getNumericCellValue();
		
		int NumericcellValue = (int) value;
		
		System.out.println(value);
		
	}
	
 
	
	
	
	}
	
	public static void main(String[] args) throws IOException {
		Data();
	}


}