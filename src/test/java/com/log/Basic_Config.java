package com.log;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Config {
	
	
	//static Logger log = Logger.getLogger(Basic_Config.class);
	static Logger log = Logger.getLogger(Basic_Config.class);//
	

	public static void main(String[] args) {
		 BasicConfigurator.configure();
		 
		 log.debug("DEBUG");
		 log.info("INFO");
		 log.warn("WARN");
		 log.error("ERROR");
		 log.fatal("FATAL");
		 
		
		
		
		
		
		

	}

}
