package com.Mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class1 {

	public static WebDriver driver;

	// Click

	public static void clickmethod(WebElement element) {

		element.click();

	}
	public static String value;

	// Sendkeys

	public static void sendValues(WebElement element, String value) {

		element.sendKeys(value);

	}

	// URL

	public static void geturl(String url) {

		driver.get(url);

	}

	// browser

	public static WebDriver browserlaunch(String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\mohanapriya R\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
			System.getProperty("user.dir" + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}

		return driver;

	}

	// close

	public static void driverclose() {

		driver.close();
	}

	// dropdown for string

	public static void dropdown(String type, WebElement element, String data) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("byIndex")) {

			int value = Integer.parseInt(data);
			s.selectByIndex(value);
		}

		else if (type.equalsIgnoreCase("byValue")) {

			s.selectByValue(data);

		} else if (type.equalsIgnoreCase("byVisibletext")) {

			s.selectByVisibleText(data);

		}

	}

	// checkbox
	public static void checkbox(WebElement element) {

		element.click();
	}

	// sleep
	public static void sleep(int seconds) throws Throwable {

		Thread.sleep(seconds);

	}

	public static void explicitwait(int seconds, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));

	}
	// scrolldown

	public static void scrolldown(WebElement element) {
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// screenshot

	public static void takesnap(String location) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sources = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\mohanapriya R\\eclipse-workspace\\Selenium_Testing\\Screenshot\\test.png");
		FileUtils.copyFile(sources, destination);
	}

	
	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);		

	}
    
	public static String Particular_Data(String path, int row_index, int column_index) throws Throwable {
		
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook w =new XSSFWorkbook(fis);
		Sheet s = w.getSheetAt(0);
		Row r = s.getRow(row_index);
		Cell c = r.getCell(column_index);
		CellType cellType = c.getCellType();
		
		String value = null;
		if (cellType.equals(CellType.STRING)) {
			 value = c.getStringCellValue(); 
			}
		else if (cellType.equals(CellType.NUMERIC)) {
			double ncv = c.getNumericCellValue();
			int val = (int) ncv;
			value = String.valueOf(val);
			
		}
		return value;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
