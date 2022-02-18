package com.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pom_Search {
	public WebDriver driver;
	
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement type;
	
	@FindBy(id="room_nos")
	private WebElement nos;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement pickin;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement out;	
	
	@FindBy(id="adult_room")
	private WebElement room;
	
	@FindBy(id="Submit")
	private WebElement search;
	

	public Pom_Search(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getNos() {
		return nos;
	}

	public WebElement getPickin() {
		return pickin;
	}

	public WebElement getOut() {
		return out;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}
	


}
