package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Login {
	
	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
    private WebElement password;
	
	@FindBy(id="login")
	private WebElement login_Btn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_Btn() {
		return login_Btn;
	}
	
		public Pom_Login(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}
    
	
	
}
