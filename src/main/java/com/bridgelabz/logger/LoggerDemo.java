package com.bridgelabz.logger;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;


public class LoggerDemo {
	static Logger logger = Logger.getLogger(App.class);
	public static void main(String[] args){
		Layout layout = new SimpleLayout();
		Appender appender = new ConsoleAppender(layout);
         logger.addAppender(appender);
		
		logger.debug("debug message");
		logger.info("info message");
		logger.warn("warm message");
		logger.error("error message");
		logger.fatal("fatal message");
	}

}
