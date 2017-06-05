package com.atongmu.mvc.controller;

import com.atongmu.mvc.model.CompanyInfo;
import com.atongmu.mvc.service.Impl.CompanyInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by lzy on 17/6/1.
 */
@Controller
public class TestController extends BaseController{

    @Autowired
    CompanyInfoServiceImpl companyInfoServiceImpl;


    @RequestMapping(value = "/testController",method = RequestMethod.GET)
    public void test(HttpServletResponse response){

        List<CompanyInfo> infos = companyInfoServiceImpl.selectInfos();
        sendResult(response,"你好");
    }

}
