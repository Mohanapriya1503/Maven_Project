package com.pomrunner;

//import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.Page_Object_Manager;
import com.Mavenproject.Base_Class1;
import com.helper.File_Reader_Manager;
import com.helper.Page_Object_Manager1;
import com.pom.Checkbox_Pom;
import com.pom.Itinerary;
import com.pom.Order_Booknow;
import com.pom.Pom_Login;
import com.pom.Pom_Search;

public class Test_Runner1 extends Base_Class1 {

	public static WebDriver driver = Base_Class1.browserlaunch("chrome");//---> chrome
	
	//public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	  public static Page_Object_Manager1 pom = new Page_Object_Manager1(driver);

//	public static Pom_Login p = new Pom_Login(driver);
//
//	public static Pom_Search s = new Pom_Search(driver);
	
	static Logger log = Logger.getLogger(Test_Runner1.class);
	
	//public static Checkbox_Pom c = new Checkbox_Pom(driver);
	
	//public static Order_Booknow o = new Order_Booknow(driver);
	
	//public static Itinerary i = new Itinerary(driver);

	public static void main(String[] args) throws Throwable {
		
		PropertyConfigurator.configure("log4j.properties");
		
		String url = File_Reader_Manager.getInstanceFRC().getInstanceCR().get_Url_data();
		
	    geturl(url);
		
		log.info("browser launch");
		
	//	implicitwait(5,TimeUnit.SECONDS);
		
	//String username = Particular_Data("C:\\Users\\mohanapriya R\\OneDrive\\Desktop\\Test Data\\Testcase_Adactin.xlsx", 3, 6);
		
	//String password = Particular_Data("C:\\Users\\mohanapriya R\\OneDrive\\Desktop\\Test Data\\Testcase_Adactin.xlsx", 4, 6);
		
	    String username = File_Reader_Manager.getInstanceFRC().getInstanceCR().get_Username();
		
		sendValues(pom.getInstanceLogin().getUsername(),username);
		
		String password = File_Reader_Manager.getInstanceFRC().getInstanceCR().get_Password();
		
		sendValues(pom.getInstanceLogin().getPassword(), password);
		
		log.info("GET THE DATA FROM EXCEL");
		
		clickmethod(pom.getInstanceLogin().getLogin_Btn());
		
		log.info("login");
		
		dropdown("byVisibletext", pom.getInstanceHotel().getLocation(), "London");
		
		dropdown("byVisibleText", pom.getInstanceHotel().getHotel(), "Hotel Sunshine");
		
		dropdown("byVisibleText", pom.getInstanceHotel().getType(), "Double");
		
		dropdown("byIndex", pom.getInstanceHotel().getNos(), "2");
		
		sendValues(pom.getInstanceHotel().getPickin(), "25/01/2022");
		
		sendValues(pom.getInstanceHotel().getOut(), "27/01/2022");
		
		dropdown("byIndex", pom.getInstanceHotel().getRoom(), "2");
		
		clickmethod(pom.getInstanceHotel().getSearch());
		
		log.info("searching hotel");
		
		checkbox(pom.getInstanceCheckbox().getRadio());
		
		clickmethod(pom.getInstanceCheckbox().getContu());
		// scrolldown(o.getScroll());
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//	    js.executeScript("window.scrollBy(0,1500)");
//		Thread.sleep(3000);
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", o.getScroll());

		
		scroll(pom.getInstanceBook().getScroll());
		
		
		sendValues(pom.getInstanceBook().getFn(), "mohana");
		sendValues(pom.getInstanceBook().getLn(), "priya");
		sendValues(pom.getInstanceBook().getAddress(), "rvs street");
		sendValues(pom.getInstanceBook().getCardno(), "1234567898765432");
		dropdown("byVisibleText", pom.getInstanceBook().getTypecard(), "VISA");
		dropdown("byIndex", pom.getInstanceBook().getMon(), "3");
		dropdown("byVisibleText", pom.getInstanceBook().getYr(), "2014");
		String ccv = File_Reader_Manager.getInstanceFRC().getInstanceCR().get_Ccvnumber();
	    sendValues(pom.getInstanceBook().getCv(), "009");
		clickmethod(pom.getInstanceBook().getBook());
		sleep(6000);
		clickmethod(pom.getInstanceIternity().getIti());
		
		log.info("logout");
		clickmethod(pom.getInstanceIternity().getLogout());

	}

	

}
