package com.atongmu.mvc.controller;

import com.atongmu.mvc.service.Impl.CompanyHistoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by yao on 6/10/17.
 */

@Controller
public class HistoryAPITesting {


    @Autowired
    CompanyHistoryServiceImpl companyHistoryServiceImpl;


    public static void main(String args[]) throws Exception{

        //get all the company history info
        System.out.println(new HistoryAPITesting().companyHistoryServiceImpl);



    }


}
