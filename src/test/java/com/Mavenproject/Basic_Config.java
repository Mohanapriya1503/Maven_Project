package com.Mavenproject;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class Basic_Config {
	
	static Logger log = Logger.getLogger(Basic_Config.class);
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		
		log.debug("debug");
		log.info("Information");
		log.warn("Warn");
		log.error("Error");
		log.fatal("Fatal");
	}

}
