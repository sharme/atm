package com.crawler.util;

import org.apache.log4j.Logger;

/**
 * Created by lzy on 17/1/8.
 */
public class LoggerUtil {
    public static void info(Class className,Object object){

        Logger.getLogger(className).info(object);
    }

    public  static void debug(Class className,Object object){
        Logger.getLogger(className).debug(object);
    }

    public  static void error(Class className,Object object){
        Logger.getLogger(className).error(object);
    }
}
