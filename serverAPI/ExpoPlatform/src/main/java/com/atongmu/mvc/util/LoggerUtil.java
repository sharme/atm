package com.atongmu.mvc.util;

import org.apache.log4j.Logger;

/**
 * logger工具类
 * @author junxian
 *
 */
public class LoggerUtil {
	
	public static String logger_root_info="console";
	
	public static void info(String info){
		Logger log = Logger.getLogger(logger_root_info);
		
		log.info(info);
	}
	
	public static void debug(String info){
		Logger log = Logger.getLogger(logger_root_info);
		log.debug(info);
	}
	
	public static void error(String info){
		Logger log = Logger.getLogger(logger_root_info);
		log.error(info);
	}
	
	public static void fatal(String info){
		Logger log = Logger.getLogger(logger_root_info);
		log.fatal(info);
	}

}
