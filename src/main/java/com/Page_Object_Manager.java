package com;

import org.openqa.selenium.WebDriver;


import com.pom.Checkbox_Pom;
import com.pom.Itinerary;
import com.pom.Order_Booknow;
import com.pom.Pom_Login;
import com.pom.Pom_Search;

public class Page_Object_Manager {
	
	public WebDriver driver;
	
	private Pom_Login login;
	
	private Pom_Search hotel;
	
	private Checkbox_Pom checkbox;
	
	private Order_Booknow order;
	
	private Itinerary iti;
	
	
	public Page_Object_Manager(WebDriver driver2) {
	
	this.driver=driver2;
	}
	
	private Order_Booknow getInstanceOrder() {
		
		if (order==null) {
			
			order =new Order_Booknow(driver);
			
		}
	    return order;
	
	}
	
	private Itinerary getInstanceIti() {
		
		if (iti==null) {
			
			iti=new Itinerary(driver);
			
			}
		return iti;
	}

	private Pom_Login getInstancelogin() {
		if (login==null) {
			login = new Pom_Login(driver);
		}
		return login;
	}
	
		
	}


