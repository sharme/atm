package com.atongmu.mvc.controller;

import com.atongmu.mvc.model.Event;
import com.atongmu.mvc.model.Notification;
import com.atongmu.mvc.service.Impl.EventServiceImpl;
import com.atongmu.mvc.service.Impl.NotificationServiceImpl;
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
public class NotificationController extends BaseController{

    @Autowired
    NotificationServiceImpl notificationService;


    @RequestMapping(value = "/getNotificationsByUId", method = RequestMethod.GET)
    public void getNotificationsByUId(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        try {

            int uID = new Integer(httpServletRequest.getParameter("u_id"));
            List<Notification> notifications = notificationService.getNotificationsByUId(uID);
            sendResult(httpServletResponse, JSONArray.fromObject(notifications).toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }





}
