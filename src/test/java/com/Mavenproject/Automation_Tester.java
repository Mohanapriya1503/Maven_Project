package com.Mavenproject;


	

	import java.awt.Window;
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
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.io.FileHandler;

	public class Automation_Tester {

		public static void main(String[] args) throws InterruptedException, IOException {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\mohanapriya R\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("http://automationpractice.com/index.php");

			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//a[@class='login']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.id("email")).sendKeys("saipriya150396@gmail.com");
			
			driver.findElement(By.id("passwd")).sendKeys("Riyas03");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//i[contains(@class,'icon')])[8]")).click();
			
			driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]")).click();
			Thread.sleep(2000);
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			
			
			//js.executeScript("window.scrollBy(0,-3000)");
			
	        js.executeScript("window.scrollBy(0,500)");
	        
	        WebElement image = driver.findElement(By.xpath("(//img[contains(@class,'replace')])[2]"));
	        image.click();
	        
	        //Actions move=new Actions(driver);
	        
	        //move.moveToElement(image).build().perform();
	        
	        //driver.findElement(By.xpath("//a[contains(@class,'quick-view-mobile')]")).click();
	        
	        
	        JavascriptExecutor js1 =(JavascriptExecutor) driver;
	        
	        js1.executeScript("window.scrollBy(0,800)");
	        
	        driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("(//a[contains(@class,'btn')])[2]")).click();
	        
	        JavascriptExecutor js2 =(JavascriptExecutor) driver;
	        
	        js2.executeScript("window.scrollBy(0,800)");
	        
	        driver.findElement(By.xpath("(//a[contains(@class,'btn')])[5]")).click();
	        
	        JavascriptExecutor js3 =(JavascriptExecutor) driver;
	        
	        js3.executeScript("window.scrollBy(0,800)");
	        
	        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	        
	        JavascriptExecutor js4 =(JavascriptExecutor) driver;
	        
	        js4.executeScript("window.scrollBy(0,800)");
	        
	        driver.findElement(By.id("cgv")).click();
	        
	        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	        
	        JavascriptExecutor js5 =(JavascriptExecutor) driver;
	        
	        js5.executeScript("window.scrollBy(0,800)");
	        
	        driver.findElement(By.xpath("//a[@class='cheque']")).click();
	        
	        JavascriptExecutor js6 =(JavascriptExecutor) driver;
	        
	        js6.executeScript("window.scrollBy(0,500)");
	        
	        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	        
	        JavascriptExecutor js7 =(JavascriptExecutor) driver;
	        
	        js7.executeScript("window.scrollBy(0,350)");
	        
	        Thread.sleep(3000);
	        
	        TakesScreenshot ts=(TakesScreenshot)driver;
	        
	        File start = ts.getScreenshotAs(OutputType.FILE);
	        
	        File end= new File("C:\\Users\\mohanapriya R\\eclipse-workspace\\Selenium_Testing\\Screenshot\\image4.png");
			
	        FileUtils.copyFile(start, end);
	        
	        driver.findElement(By.xpath("(//a[contains(@class,'button')])[3]")).click();
			
			JavascriptExecutor js8 =(JavascriptExecutor)driver;
			
			js8.executeScript("window.scrollBy(0,500)");
			
			TakesScreenshot ts1=(TakesScreenshot)driver;
			
			File start1 =ts1.getScreenshotAs(OutputType.FILE);
			
			File end1=new File("C:\\Users\\mohanapriya R\\eclipse-workspace\\Selenium_Testing\\Screenshot\\image5.png");
			
			FileUtils.copyFile(start1, end1);
			
			
			
		}

	}



