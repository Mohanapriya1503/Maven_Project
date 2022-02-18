package com.pom;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Check {
	
	
	

	

	public WebDriver driver;
	
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeScript("arguments[0].")

	@FindBy(xpath="//a[contains(@class,'button btn btn')]")
	private WebElement proceed;
	
	public WebElement getProceed() {
		return proceed;
	}
	
	public Order_Check(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
}
