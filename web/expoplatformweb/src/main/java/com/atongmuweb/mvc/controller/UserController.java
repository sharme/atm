package com.atongmuweb.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lzy on 17/6/1.
 */
@Controller
//@RequestMapping("/user")
public class UserController extends BaseController{


    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView login(HttpServletResponse response, HttpServletRequest request){

        StringBuffer url1 = request.getRequestURL();
        String tempContextUrl1 = url1.delete(request.getRequestURL().length() - request.getRequestURI().length(), url1.length()).append(request.getServletContext().getContextPath()).append("/").toString();
        ModelAndView mv = new ModelAndView();
        //添加模型数据，可以是任意的POJO对象的
        mv.addObject("contentUrl",tempContextUrl1);
        //设置逻辑视图名，视图解析器会根据改名字解析到具体的视图页面
        mv.setViewName("user/login");


        return mv;
    }

    //register

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public ModelAndView register(HttpServletResponse response, HttpServletRequest request){

        StringBuffer url1 = request.getRequestURL();
        String tempContextUrl1 = url1.delete(request.getRequestURL().length() - request.getRequestURI().length(), url1.length()).append(request.getServletContext().getContextPath()).append("/").toString();
        ModelAndView mv = new ModelAndView();
        //添加模型数据，可以是任意的POJO对象的
        mv.addObject("contentUrl",tempContextUrl1);
        //设置逻辑视图名，视图解析器会根据改名字解析到具体的视图页面
        mv.setViewName("user/register");


        return mv;
    }


}
