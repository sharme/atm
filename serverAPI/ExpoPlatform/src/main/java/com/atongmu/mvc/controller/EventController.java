package com.atongmu.mvc.controller;

import com.atongmu.mvc.model.Event;
import com.atongmu.mvc.service.Impl.EventServiceImpl;
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
            List<Event> events;
            if(httpServletRequest.getParameter("type") != null) {
                events = eventService.getEvents(new Integer(httpServletRequest.getParameter("count")), new String(httpServletRequest.getParameter("type").getBytes("iso-8859-1"), "utf-8"));
            } else  {
                events = eventService.getEvents(new Integer(httpServletRequest.getParameter("count")), null);

            }
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











}
