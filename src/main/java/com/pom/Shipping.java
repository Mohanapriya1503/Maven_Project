package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	public WebDriver driver;
	
	@FindBy(xpath="(//a[text()='Contact us']")
	private WebElement contact;
	
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement termsofservice;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement proceed;

	public WebElement getContact() {
		return contact;
	}

	public WebElement getTermsofservice() {
		return termsofservice;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public Shipping(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	

}
