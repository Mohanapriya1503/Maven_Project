package com.Mavenproject;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Runner extends Base_Class1 {

	public static void main(String[] args) {
		

		//System.setProperty("webdriver.chrome.driver",
			//	"C:\\Users\\mohanapriya R\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
        //System.getProperty("user.dir" + "\\Driver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		browserlaunch("chrome");
		
		geturl("http://automationpractice.com/index.php");
		

		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
	
		clickmethod(signin);
		
		
		WebElement email = driver.findElement(By.id("email"));
		
		sendValues(email,"saipriya150396@gmail.com");
		
		
		
		WebElement pass = driver.findElement(By.id("passwd"));
		
		sendValues(pass,"Riyas03");
		
		WebElement login = driver.findElement(By.xpath("(//i[contains(@class,'icon')])[8]"));
		
		clickmethod(login);
		
		
		WebElement click = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
		clickmethod(login);
		
		driverclose();
		
	}

}
