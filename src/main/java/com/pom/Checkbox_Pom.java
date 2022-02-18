package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkbox_Pom {
	public WebDriver driver;
	
	@FindBy(id="radiobutton_0")
    private WebElement radio;
	
	@FindBy(id="continue")
    private WebElement contu;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getContu() {
		return contu;
	}

	public Checkbox_Pom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}


}
