package com.atongmu.mvc.controller;

import com.atongmu.mvc.model.Feedback;
import com.atongmu.mvc.model.Newest;
import com.atongmu.mvc.service.Impl.FeedbackServiceImpl;
import com.atongmu.mvc.service.Impl.NewestServiceImpl;
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
public class FeedbackController extends BaseController{

    @Autowired
    FeedbackServiceImpl newestService;

    @RequestMapping(value = "/getAllFeedback", method = RequestMethod.GET)
    public void getNewest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        try {
            List<Feedback> feedbacks = newestService.getAllFeedback();
            sendResult(httpServletResponse, JSONArray.fromObject(feedbacks).toString());
        } catch (Exception e) {
            sendResult(httpServletResponse, "{code: 500, success: false}");
        }

    }

    @RequestMapping(value = "/addFeedback", method = RequestMethod.POST)
    public void insertNewest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        try {
            Feedback feedback = new Feedback();

            feedback.setU_id(new Integer(httpServletRequest.getParameter("u_id")));
            feedback.setF_msg(httpServletRequest.getParameter("f_msg"));
            feedback.setF_created_by("admin");
            feedback.setF_updated_by("admin");

            //Insert into table
            newestService.addFeedback(feedback);

            System.out.println("json: " + JSONArray.fromObject(feedback).toString());

            sendResult(httpServletResponse, "{success: true, n_id: " + feedback.getF_id() + "}");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
