package com.logger.demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_Configuration {

	
	// factory design pattern
	
	static Logger log = Logger.getLogger(Property_Configuration.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PropertyConfigurator.configure("log4j.properties");
		
		log.debug("Debug");
		
		log.info("Info");
		
		log.warn("Warning");
		
		log.error("Error");
		
		log.fatal("fatal");
		log.fatal("fatal");
	
		
		
	}

}