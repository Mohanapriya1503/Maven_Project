package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader  {
	
	public static Properties p;

	public Configuration_Reader() throws Throwable {
	

		File f=new File("C:\\Users\\mohanapriya R\\eclipse-workspace\\Mavenproject\\src\\main\\java\\com\\configuration\\properties\\configuration.properties");

		FileInputStream fis = new FileInputStream(f);
		
	    p = new Properties();
	    
	    p.load(fis);
		
	}
	
	public String get_Url_data() {
		
		 String url = p.getProperty("url");

		return url;
	}
	
	public String get_Username() {
		
		String username = p.getProperty("username");
		
		return username;
		
}
	public String get_Password() {
		
		String password = p.getProperty("password");
		
		return password;

	}
	
	public String get_Ccvnumber() {
		
		String ccv = p.getProperty("ccv");
		return ccv;
		

	}
	
	
	
}
