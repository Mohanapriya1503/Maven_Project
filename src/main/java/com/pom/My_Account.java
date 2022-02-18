package com.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Account {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[text()='Contact us']")
	private WebElement contactus;
	
	@FindBy(xpath="//a[text()='Sign out]")
    private WebElement signout;
	
	@FindBy(xpath="//span[text()='My account']")
	private WebElement account;
	
	@FindBy(xpath="//a[text()='Women']")
	private WebElement women;
	
	@FindBy(xpath="//a[text()='Dresses']")
	private WebElement dresses;
	
	@FindBy(xpath="//a[text()='T-shirts']")
	private WebElement tshirt;
	
	@FindBy(xpath="//div[@class='cat-title active']")
	private WebElement categories;
		
    @FindBy(xpath="//i[text()='Order history and details']")
	private WebElement orderhistory;
	
	@FindBy(xpath="//i[text()='My wishlists']")
	private WebElement mywish;
	
	@FindBy(xpath="//i[text()='My credit slips']")
	private WebElement mycredit;
	
	@FindBy(xpath="i[text()='My addresses']")
	private WebElement address;
	
	@FindBy(xpath="//a[@class='btn btn-default button button-small']")
	private WebElement home;
	

	public WebElement getContactus() {
		return contactus;
	}

	public WebElement getSignout() {
		return signout;
	}

	public WebElement getAccount() {
		return account;
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getTshirt() {
		return tshirt;
	}

	public WebElement getCategories() {
		return categories;
	}

	public WebElement getOrderhistory() {
		return orderhistory;
	}

	public WebElement getMywish() {
		return mywish;
	}

	public WebElement getMycredit() {
		return mycredit;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getHome() {
		return home;
	}
	
	public My_Account(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
}
