package com.atongmu.mvc.controller;

import com.atongmu.mvc.model.Newest;
import com.atongmu.mvc.service.Impl.NewestServiceImpl;
import com.sun.org.apache.bcel.internal.generic.NEW;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by yao on 6/22/17.
 */
@Controller
public class NewestController extends BaseController{

    @Autowired
    NewestServiceImpl newestService;

    @RequestMapping(value = "/getNewest", method = RequestMethod.GET)
    public void getNewest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        try {
            List<Newest> lll = newestService.getNewest(new Integer(httpServletRequest.getParameter("count")));
            sendResult(httpServletResponse, JSONArray.fromObject(lll).toString());
        } catch (Exception e) {
            sendResult(httpServletResponse, "{code: 500, success: false}");
        }

    }

    @RequestMapping(value = "/insertNewest", method = RequestMethod.POST)
    public void insertNewest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        try {
            Newest newest = new Newest();

            newest.setN_from(new Integer(httpServletRequest.getParameter("n_from")));
            newest.setN_to(new Integer(httpServletRequest.getParameter("n_to")));
            newest.setN_message(httpServletRequest.getParameter("n_message"));
            newest.setN_created_by("system");
            newest.setN_updated_by("system");

            //Insert into table
            newestService.insertNewest(newest);

            System.out.println("json: " + JSONArray.fromObject(newest).toString());

            sendResult(httpServletResponse, "{success: true, n_id: " + newest.getN_id() + "}");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
