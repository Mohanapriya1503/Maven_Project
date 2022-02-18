package com.log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class property_File {
	
	static Logger log = Logger.getLogger(property_File.class);
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.debug("debug");
		log.info("Information");
		log.warn("Warn");
		log.error("Error");
		log.fatal("Fatal");
	}

}
