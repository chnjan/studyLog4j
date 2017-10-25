package com.cj.log4j;

import org.apache.log4j.Logger;

import com.cj.jibie.Jibie;

public class TestLog4j {

	private final static Logger LOGGER = Logger.getLogger(TestLog4j.class);
	
	public static void main(String[] args) {
		LOGGER.error("error log");
		LOGGER.info("info log");
		LOGGER.debug("debug log");
		
		Jibie jb = new Jibie();
		jb.testJibie();

	}

}
