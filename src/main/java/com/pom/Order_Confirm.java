package com.pom;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Confirm {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[text()='Contact us']")
	private WebElement contactus;
	
	@FindBy(xpath="//a[text()='Sign out]")
    private WebElement signout;
	
	@FindBy(xpath="(//a[contains(@class,'button')])[1]")
	private WebElement backtoorder;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getContactus() {
		return contactus;
	}

	public WebElement getSignout() {
		return signout;
	}

	public WebElement getBacktoorder() {
		return backtoorder;
	}
	
	public Order_Confirm(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	
}
