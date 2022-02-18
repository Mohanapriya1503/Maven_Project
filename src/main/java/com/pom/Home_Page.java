package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[text()='Contact us']")
	private WebElement contact;
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement signin;
	
	@FindBy(xpath="//a[text()='Women']")
	private WebElement women;
	
	@FindBy(xpath="//a[text()='Dresses']")
	private WebElement dresses;
	
	@FindBy(xpath="//a[text()='T-shirts']")
	private WebElement tshirt;
	
	@FindBy(xpath="(//a[contains(@title,'View my')])")
	private WebElement cart;
	
	public WebElement getContact() {
		return contact;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getTshirt() {
		return tshirt;
	}

	public WebElement getCart() {
		return cart;
	}

	
	public Home_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}
	
}
	


