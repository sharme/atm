package com.atongmu.mvc.controller;

import com.atongmu.mvc.service.Impl.NewestServiceImpl;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by yao on 6/22/17.
 */
@Controller
public class NewestController extends BaseController{

    @Autowired
    NewestServiceImpl newestService;

    @RequestMapping(value = "/getNewest", method = RequestMethod.GET)
    public void getNewest(HttpServletResponse httpServletResponse) throws Exception {

        sendResult(httpServletResponse, JSONArray.fromObject(newestService.getNewest()).toString());

    }


}
