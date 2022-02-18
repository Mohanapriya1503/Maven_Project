package com.helper;

import org.openqa.selenium.WebDriver;

import com.pom.Checkbox_Pom;
import com.pom.Itinerary;
import com.pom.Order_Booknow;
import com.pom.Pom_Login;
import com.pom.Pom_Search;

public class Page_Object_Manager1 {

public WebDriver driver;
	
	private Pom_Login login;
	
	private Pom_Search hotel;
	
	private Checkbox_Pom checkbox;
	
	private Order_Booknow book;
	
	private Itinerary itinerary;
	

	
	
	
	public Page_Object_Manager1(WebDriver driver2) {
		this.driver = driver2;
	}
	public Pom_Login getInstanceLogin() {
		if (login == null) {
			
			login = new Pom_Login(driver);		
			
		}return login;
		
	}
	public Pom_Search getInstanceHotel() {
		if (hotel==null) {
			hotel = new Pom_Search(driver);
			
		}return hotel;
	}
	
	public Checkbox_Pom getInstanceCheckbox() {
		if (checkbox==null) {
			checkbox = new Checkbox_Pom(driver);
		}return checkbox;
	}
	
	public Order_Booknow getInstanceBook() {
		if (book==null) {
			book = new Order_Booknow(driver);
		}return book;
	}
	
	public Itinerary getInstanceIternity() {
		if (itinerary==null) {
			itinerary = new Itinerary(driver);
		}return itinerary;
	}
	
//	public void getInstancelogout() {
//		if (logout==null) {
//			logout = new Logout(driver);
//		}return logout;
			
		}
	
	
	

