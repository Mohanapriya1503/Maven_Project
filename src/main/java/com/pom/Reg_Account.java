package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reg_Account {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[text()='Contact us']")
	private WebElement contact1;
	
	@FindBy(xpath="//a[text()='Sign in']")
	private WebElement signin1;
	
	@FindBy(xpath="//a[text()='Women']")
	private WebElement Women;
	
	@FindBy(xpath="//a[text()='Dresses']")
	private WebElement dresses;
	
	@FindBy(xpath="//a[text()='T-shirts']")
	private WebElement tshirt;
	
	@FindBy(id="email_create")
	private WebElement createmail;
	
	@FindBy(id="SubmitCreate")
	private WebElement submit;
	
	@FindBy(id="email")
	private WebElement alrmailid;
	
	@FindBy(id="passwd")
	private WebElement alrpassword;
	
	@FindBy(xpath="//a[text()='Forgot your password?']")
	private WebElement forgotpasswd;
	
	@FindBy(id="SubmitLogin")
	private WebElement submitlogin;
	
	
	
	public WebDriver getDriver() {
		return driver;
	}



	public WebElement getContact1() {
		return contact1;
	}



	public WebElement getSignin1() {
		return signin1;
	}



	public WebElement getWomen() {
		return Women;
	}



	public WebElement getDresses() {
		return dresses;
	}



	public WebElement getTshirt() {
		return tshirt;
	}



	public WebElement getCreatemail() {
		return createmail;
	}



	public WebElement getSubmit() {
		return submit;
	}



	public WebElement getAlrmailid() {
		return alrmailid;
	}



	public WebElement getAlrpassword() {
		return alrpassword;
	}



	public WebElement getForgotpasswd() {
		return forgotpasswd;
	}



	public WebElement getSubmitlogin() {
		return submitlogin;
	}



	public Reg_Account(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	

}
