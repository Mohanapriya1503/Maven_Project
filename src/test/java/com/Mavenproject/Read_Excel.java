package com.Mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {
	
	private static void data_Readexcel() throws Throwable
	{
		//read data
		
	File f = new File("C:\\Users\\mohanapriya R\\eclipse-workspace\\Mavenproject\\Excel\\Book1.xlsx");
	
	FileInputStream fs =new FileInputStream(f);
	
	Workbook b =new XSSFWorkbook(fs);
	
	Sheet sheetAt = b.getSheetAt(0);

	Row row = sheetAt.getRow(1);
	
	Cell cell = row.getCell(1);
	
	CellType cellType = cell.getCellType();
	
	if (cellType.equals(CellType.STRING)) {
		
		String scv = cell.getStringCellValue();
		
		System.out.println(scv);
		
		}

	else if (cellType.equals(CellType.NUMERIC)) {
		
		double ncv = cell.getNumericCellValue();
		
		int val =(int) ncv;
		
		System.out.println(val);
		}  
	
	}

        public static void main(String[] args) throws Throwable {
			
        	System.out.println("ANC");
        	
        	data_Readexcel();
		}


}