package com.tealium.utilities;

import org.apache.log4j.Logger;

public class Log {
	
	//Initialize Log4j logs
	public static Logger log=Logger.getLogger(Log.class.getName());
	
	public static void startTestCase(String sTestCaseName) {
		log.info("================"+sTestCaseName+" TEST START "+"===================");
	}
	
	public static void endTestCaseName(String sTestCaseName) {
		log.info("================"+sTestCaseName+" TEST END "+"====================");
	}
	
	// NEED TO CREATE BELOW METHODS, SO THAT THEY CAN BE CALLED
	
	public static void info(String message) {
		log.info(message);
	}
	
	public static void warn(String message) {
		log.warn(message);
	}
	
	public static void error(String message) {
		log.error(message);
	}
	
	public static void fatal(String message) {
		log.fatal(message);
	}
	
	public static void debug(String message) {
		log.debug(message);
	}
	

}
