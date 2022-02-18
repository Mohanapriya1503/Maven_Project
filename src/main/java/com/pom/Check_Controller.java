package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_Controller {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[text()='Contact us']")
    private WebElement contact;
	
	@FindBy(xpath="//div[@class='shopping_cart']")
	private WebElement cart;
	
	@FindBy(xpath="//span[text()='I confirm my order']")
	private WebElement confirm;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getContact() {
		return contact;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getConfirm() {
		return confirm;
	}
	
	public Check_Controller(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
}
}