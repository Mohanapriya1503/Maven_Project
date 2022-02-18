package com.Mavenproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Tester {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mohanapriya R\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.id("username"));
		login.sendKeys("Mohanapriya15");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Riyas03");
		driver.findElement(By.id("login")).click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select L = new Select (location);
		L.selectByVisibleText("London");
		Thread.sleep(1500);
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select h = new Select(hotel);
		h.selectByVisibleText("Hotel Sunshine");
		Thread.sleep(1500);
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select r = new Select(roomtype);
		r.selectByVisibleText("Double");
		
		WebElement no = driver.findElement(By.id("room_nos"));
		Select n = new Select(no);
		n.selectByVisibleText("2 - Two");
		
		WebElement datein = driver.findElement(By.id("datepick_in"));
		datein.clear();
		datein.sendKeys("15/03/2022");
		
		WebElement out = driver.findElement(By.id("datepick_out"));
		out.clear();
		out.sendKeys("17/03/2022");		

        WebElement adult = driver.findElement(By.id("adult_room"));
        Select a = new Select(adult);
        a.selectByVisibleText("4 - Four");
        
        driver.findElement(By.id("Submit")).click();
        
        driver.findElement(By.id("radiobutton_0")).click();
        
        driver.findElement(By.id("continue")).click();
        
        driver.findElement(By.id("first_name")).sendKeys("priya");
        
        driver.findElement(By.id("last_name")).sendKeys("Ravi");
        
        driver.findElement(By.id("address")).sendKeys("2/322 rvscstreet");
        
        driver.findElement(By.id("cc_num")).sendKeys("1234567899876543");
        
        WebElement type = driver.findElement(By.id("cc_type"));
        Select t = new Select(type);
        t.selectByVisibleText("VISA");
        Thread.sleep(1000);
        
        WebElement mon = driver.findElement(By.id("cc_exp_month"));
        Select m = new Select(mon);
        m.selectByVisibleText("March");
        
        WebElement yr = driver.findElement(By.id("cc_exp_year"));
        Select y = new Select(yr);
        y.selectByVisibleText("2022");
        
        driver.findElement(By.id("cc_cvv")).sendKeys("003");
        
        driver.findElement(By.id("book_now")).click();
        Thread.sleep(3500);
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(3000);
        
        driver.findElement(By.id("my_itinerary")).click();
        Thread.sleep(3000);
        
        TakesScreenshot ts = (TakesScreenshot) driver;
        File start =ts.getScreenshotAs(OutputType.FILE);
        File end = new File("C:\\Users\\mohanapriya R\\eclipse-workspace\\Selenium_Testing\\Screenshot\\booking.png");
        FileUtils.copyFile(start, end);
        Thread.sleep(1500);
        
        driver.findElement(By.id("logout")).click();
        driver.close();
	}

}
