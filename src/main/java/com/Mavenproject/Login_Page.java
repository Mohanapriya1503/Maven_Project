package com.Mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	
	@FindBy(id="email")
	private WebElement username;
	private WebDriver driver;

	public WebElement getUsername() {
		return username;
	}
	
	public Login_Page(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(id="passwd")
	private WebElement Password;

	public WebElement getPassword() {
		return Password;
	}
	
	
	
	
	
	
	
}

