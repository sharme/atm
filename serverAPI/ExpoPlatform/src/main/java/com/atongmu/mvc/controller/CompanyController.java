package com.atongmu.mvc.controller;

import com.atongmu.mvc.model.Company;
import com.atongmu.mvc.model.Designer;
import com.atongmu.mvc.service.Impl.CompanyServiceImpl;
import com.atongmu.mvc.service.Impl.DesignerServiceImpl;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by yao on 6/26/17.
 */
@Controller
public class CompanyController extends BaseController{


    @Autowired
    CompanyServiceImpl companyService;

    @RequestMapping(value = "/getCompanies", method = RequestMethod.GET)
    public void getCompanies(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        try {

            int count = new Integer(httpServletRequest.getParameter("count"));
            int start = new Integer(httpServletRequest.getParameter("start"));
            String type = null;
            if(httpServletRequest.getParameter("type") != null)
                type = new String(httpServletRequest.getParameter("type").getBytes("iso-8859-1"), "utf-8");
            String city = null;
            if(httpServletRequest.getParameter("city") != null)
                city = new String(httpServletRequest.getParameter("city").getBytes("iso-8859-1"), "utf-8");

            List<Company> companies = companyService.getCompanies(start, count, type, city);
            sendResult(httpServletResponse, JSONArray.fromObject(companies).toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @RequestMapping(value = "/getCompanyById", method = RequestMethod.GET)
    public void getCompanyById(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        try {
            Company company = companyService.getCompanyById(new Integer(httpServletRequest.getParameter("id")));
            sendResult(httpServletResponse, JSONArray.fromObject(company).toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @RequestMapping(value = "/getCompanyByUId", method = RequestMethod.GET)
    public void getCompanyByUId(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        try {
            Company company = companyService.getCompanyByUId(new Integer(httpServletRequest.getParameter("u_id")));
            sendResult(httpServletResponse, JSONArray.fromObject(company).toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/getCompanyNumber", method = RequestMethod.GET)
    public void getCompanyNumber(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        try {
            int total = companyService.getCompanyNumber();
            sendResult(httpServletResponse, "[{total: "+ total +"}]");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
