package com.atongmu.mvc.controller;

import com.atongmu.mvc.model.Event;
import com.atongmu.mvc.service.Impl.EventServiceImpl;
import com.fasterxml.jackson.databind.ser.Serializers;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by yao on 6/25/17.
 */
@Controller
public class EventController extends BaseController{

    @Autowired
    EventServiceImpl eventService;


    @RequestMapping(value = "/getEvents", method = RequestMethod.GET)
    public void getEvents(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        try {

            int count = new Integer(httpServletRequest.getParameter("count"));
            int start = new Integer(httpServletRequest.getParameter("start"));
            String type = null;
            if(httpServletRequest.getParameter("type") != null)
                type = new String(httpServletRequest.getParameter("type").getBytes("iso-8859-1"), "utf-8");
            String city = null;
            if(httpServletRequest.getParameter("city") != null)
                city = new String(httpServletRequest.getParameter("city").getBytes("iso-8859-1"), "utf-8");

            List<Event> events = eventService.getEvents(start, count, type, city);
            sendResult(httpServletResponse, JSONArray.fromObject(events).toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @RequestMapping(value = "/getEventById", method = RequestMethod.GET)
    public void getEventById(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        try {
            Event event = eventService.getEventById(new Integer(httpServletRequest.getParameter("id")));
            sendResult(httpServletResponse, JSONArray.fromObject(event).toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @RequestMapping(value = "/getEventNumber", method = RequestMethod.GET)
    public void getEventNumber(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        try {
            int event = eventService.getEventNumber();
            sendResult(httpServletResponse, "[{total: "+ JSONArray.fromObject(new Integer(event)).toString() +"}]");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }










}
