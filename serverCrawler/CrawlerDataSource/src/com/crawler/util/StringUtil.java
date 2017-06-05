package com.crawler.util;

/**
 * Created by lzy on 17/1/9.
 */
public class StringUtil {

    public static boolean isNoEmpty(String str){

        if(str == null || str.isEmpty() || str.replace(" ","").length() == 0){
            return false;
        }else{
            return true;
        }
    }
}
