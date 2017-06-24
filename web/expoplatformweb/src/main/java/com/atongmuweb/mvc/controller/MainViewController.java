package com.atongmuweb.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by lzy on 17/6/6.
 */
@Controller
//@RequestMapping("/user")
public class MainViewController extends BaseController{

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView index(HttpServletResponse response){
        ModelAndView mv = new ModelAndView();
        //添加模型数据，可以是任意的POJO对象的
        mv.addObject("message","用户登录!");
        //设置逻辑视图名，视图解析器会根据改名字解析到具体的视图页面
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "/about-us",method = RequestMethod.GET)
    public String aboutUS(){
        return "about-us";
    }

    @RequestMapping(value = "/news",method = RequestMethod.GET)
    public String news(){
        return "news";
    }

    @RequestMapping(value = "/solutions",method = RequestMethod.GET)
    public String solutions(){
        return "solutions";
    }

    @RequestMapping(value = "/product-show",method = RequestMethod.GET)
    public String productshow(){
        return "product-show";
    }

    @RequestMapping(value = "/customer-case",method = RequestMethod.GET)
    public String customercase(){
        return "customer-case";
    }

    @RequestMapping(value = "/service-center",method = RequestMethod.GET)
    public String servicecenter(){
        return "service-center";
    }
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "home";
    }

    @RequestMapping(value = "/exhibition-activities",method = RequestMethod.GET)
    public String exactivity(){
        return "exhibition-activities";
    }
}
