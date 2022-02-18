package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Booknow {

	public WebDriver driver;

	@FindBy(id = "first_name")
	private WebElement fn;

	@FindBy(id = "last_name")
	private WebElement ln;

	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;

	public WebElement getFn() {
		return fn;
	}

	public WebElement getLn() {
		return ln;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getTypecard() {
		return typecard;
	}

	public WebElement getMon() {
		return mon;
	}

	public WebElement getYr() {
		return yr;
	}

	public WebElement getCv() {
		return cv;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getScroll() {
		return scroll;
	}

	@FindBy(id = "cc_num")
	private WebElement cardno;

	@FindBy(id = "cc_type")
	private WebElement typecard;

	@FindBy(id = "cc_exp_month")
	private WebElement mon;

	@FindBy(id = "cc_exp_year")
	private WebElement yr;

	@FindBy(id = "cc_cvv")
	private WebElement cv;

	@FindBy(id = "book_now")
	private WebElement book;

	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement scroll;

	public Order_Booknow(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

}
