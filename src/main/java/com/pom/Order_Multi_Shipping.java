package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Multi_Shipping {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[text()='Contact us']")
	private WebElement contactus;
	
	@FindBy(xpath="//a[text()='Sign out]")
    private WebElement signout;
	
	@FindBy(xpath="(//p[@class='payment_module'])[2]")
    private WebElement paybycheck;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getContactus() {
		return contactus;
	}

	public WebElement getSignout() {
		return signout;
	}

	public WebElement getPaybycheck() {
		return paybycheck;
	}
	
	public Order_Multi_Shipping(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
}
