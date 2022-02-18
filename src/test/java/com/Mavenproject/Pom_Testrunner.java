package com.Mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Testrunner {
	
	
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement signin;
	private WebDriver driver;

	public WebElement getUsername() {
		return signin;
	}
	
	
	public Pom_Testrunner(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSignin() {
		return signin;
	}

	@FindBy(id="email")
	private WebElement username;
	
       	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
