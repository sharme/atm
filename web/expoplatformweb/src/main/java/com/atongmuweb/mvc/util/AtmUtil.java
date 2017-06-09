package com.atongmuweb.mvc.util;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lzy on 17/6/9.
 */
public class AtmUtil {
    public static String getCurrentRequestContentUrl(HttpServletRequest request){

//        if(tempContextUrl1 == null){
        StringBuffer url1 = request.getRequestURL();
        String tempContextUrl1 = url1.delete(request.getRequestURL().length() - request.getRequestURI().length(), url1.length()).append(request.getServletContext().getContextPath()).append("/").toString();
//        }

        return tempContextUrl1;
    }
}
