package com.atongmu.mvc.controller;

import com.atongmu.mvc.model.Event;
import com.atongmu.mvc.model.Exhibitor;
import com.atongmu.mvc.service.Impl.ExhibitorServiceImpl;
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
public class ExhibitorController extends BaseController{


    @Autowired
    ExhibitorServiceImpl exhibitorService;

    @RequestMapping(value = "/getExhibitors", method = RequestMethod.GET)
    public void getExhibitors(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        try {

            int count = new Integer(httpServletRequest.getParameter("count"));
            int start = new Integer(httpServletRequest.getParameter("start"));
            String type = null;
            if(httpServletRequest.getParameter("type") != null)
                type = new String(httpServletRequest.getParameter("type").getBytes("iso-8859-1"), "utf-8");
            String city = null;
            if(httpServletRequest.getParameter("city") != null)
                city = new String(httpServletRequest.getParameter("city").getBytes("iso-8859-1"), "utf-8");

            List<Exhibitor> exhibitors = exhibitorService.getExhibitors(start, count, type, city);
            sendResult(httpServletResponse, JSONArray.fromObject(exhibitors).toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @RequestMapping(value = "/getExhibitorById", method = RequestMethod.GET)
    public void getExhibitorById(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        try {
            Exhibitor exhibitor = exhibitorService.getExhibitorById(new Integer(httpServletRequest.getParameter("id")));
            sendResult(httpServletResponse, JSONArray.fromObject(exhibitor).toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @RequestMapping(value = "/getExhibitorByUId", method = RequestMethod.GET)
    public void getExhibitorByUId(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        try {
            Exhibitor exhibitor = exhibitorService.getExhibitorByUId(new Integer(httpServletRequest.getParameter("u_id")));
            sendResult(httpServletResponse, JSONArray.fromObject(exhibitor).toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @RequestMapping(value = "/getExhibitorNumber", method = RequestMethod.GET)
    public void getExhibitorNumber(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        try {
            int total = exhibitorService.getExhibitorNumber();
            sendResult(httpServletResponse, "[{total: "+ total +"}]");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
