package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itinerary {
	  
	public WebDriver driver;
	
	@FindBy(id="my_itinerary")
    private WebElement iti;

	public WebElement getIti() {
		return iti;
	}
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
//	public WebDriver getDriver() {
//		return driver;
//	}

	public WebElement getLogout() {
		return logout;
	}

	public Itinerary(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

}
}