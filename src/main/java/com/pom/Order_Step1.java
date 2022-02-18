package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Step1 {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy(xpath="//span[text()='Update']")
    private WebElement updateaddress;
	
	@FindBy(xpath="//span[text()='Add a new address']")
	private WebElement newaddressadd;
	
	@FindBy(xpath="Proceed to checkout")
	private WebElement proceed;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getUpdateaddress() {
		return updateaddress;
	}

	public WebElement getNewaddressadd() {
		return newaddressadd;
	}

	public WebElement getProceed() {
		return proceed;
	}
	
	public Order_Step1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
}
