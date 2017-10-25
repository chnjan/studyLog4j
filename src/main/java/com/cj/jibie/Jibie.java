package com.cj.jibie;

import org.apache.log4j.Logger;

public class Jibie {

	
	private final static Logger LOGGER = Logger.getLogger(Jibie.class);
	
	public void testJibie()
	{
		LOGGER.info("jibie log");
		LOGGER.debug("debug jb log");
		LOGGER.error("error jibie log");
	}
}
