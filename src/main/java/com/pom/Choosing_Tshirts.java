package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Choosing_Tshirts {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//a[text()='Contact us'])[1]")
	private WebElement contact;
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement signin;
	
	@FindBy(xpath="//a[text()='Women']")
	private WebElement women;
	
	@FindBy(xpath="//a[text()='Dresses']")
	private WebElement dresses;
	
	@FindBy(xpath="//a[text()='T-shirts']")
	private WebElement tshirt;
	
	@FindBy(xpath="//label[text()='Sort by']")
	private WebElement sortby;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement sizemedium;
	
	@FindBy(xpath="//i[@class='icon-remove']")
	private WebElement remove;
	
	@FindBy(xpath="//input[@class='color-option on ']")
	private WebElement clr;
	
	@FindBy(xpath="//span[text()='More']")
	private WebElement more;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addtocard;
	
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")					
	private WebElement proceed;

	public WebElement getContact() {
		return contact;
	}

	public WebElement getSignin() {
		return signin;
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

	public WebElement getSortby() {
		return sortby;
	}

	public WebElement getSizemedium() {
		return sizemedium;
	}

	public WebElement getRemove() {
		return remove;
	}

	public WebElement getClr() {
		return clr;
	}

	public WebElement getMore() {
		return more;
	}

	public WebElement getAddtocard() {
		return addtocard;
	}

	public WebElement getProceed() {
		return proceed;
	}
	
	public Choosing_Tshirts(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}
	
}
	
	
	
	


