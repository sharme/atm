package com.atongmuweb.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by lzy on 17/6/1.
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController{


    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView test(HttpServletResponse response){
        ModelAndView mv = new ModelAndView();
        //添加模型数据，可以是任意的POJO对象的
        mv.addObject("message","用户登录!");
        //设置逻辑视图名，视图解析器会根据改名字解析到具体的视图页面
        mv.setViewName("user/login");
        return mv;
    }

}
