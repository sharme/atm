package com.atongmu.mvc.controller;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lzy on 17/6/10.
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController{
    /////登录
    @RequestMapping(value="/login",method = RequestMethod.GET)
    public void login(HttpServletRequest request, HttpServletResponse response){
        String requestStr= getRequestBodyParam(request);
//        JSONObject
        sendResult(response,"aa","200","登录成功");
    }

    @RequestMapping(value="/getMessageCode",method = RequestMethod.GET)
    public void sendMessageCode(HttpServletRequest request, HttpServletResponse response){



    }
}
