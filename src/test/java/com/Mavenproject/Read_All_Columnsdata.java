package com.Mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_All_Columnsdata {
	
public static void All_Columns_Data() throws IOException {
		
		File f =new File("C:\\Users\\mohanapriya R\\OneDrive\\Desktop\\DataDriven1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		int pnr = s.getPhysicalNumberOfRows();
		for (int i = 0; i<pnr; i++) {

		Row r = s.getRow(i);
		Cell c = r.getCell(1);
		CellType ce = c.getCellType();
	
		if (ce.equals(CellType.STRING)) {
			
			String value = c.getStringCellValue();
			System.out.println(value);
		}
		
		else if (ce.equals(CellType.NUMERIC)) {
			
			double ncv = c.getNumericCellValue();
			int value=(int)ncv;
		    
			System.out.println(value);
		}
		
		}
}
public static void main(String[] args) throws Throwable {
	All_Columns_Data();
	
}
}



