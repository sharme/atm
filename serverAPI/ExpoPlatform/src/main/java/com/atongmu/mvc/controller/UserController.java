package com.atongmu.mvc.controller;

import com.atongmu.mvc.model.Company;
import com.atongmu.mvc.model.Newest;
import com.atongmu.mvc.model.User;
import com.atongmu.mvc.service.Impl.CompanyServiceImpl;
import com.atongmu.mvc.service.Impl.UserServiceImpl;
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
public class UserController extends BaseController{


    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "/getUserById", method = RequestMethod.GET)
    public void getEvents(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        try {

            int id = new Integer(httpServletRequest.getParameter("id"));
            User user = userService.getUserById(id);
            sendResult(httpServletResponse, JSONArray.fromObject(user).toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public void getEventById(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @RequestMapping(value = "/updateUserById", method = RequestMethod.POST)
    public void updateUserById(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        try {
            User user = new User();

            user.setU_avatar(new String(httpServletRequest.getParameter("u_avatar")));
            user.setU_desc(new String(httpServletRequest.getParameter("u_desc")));
            user.setU_address(httpServletRequest.getParameter("u_address"));
            user.setU_updated_by("admin");
            user.setU_id(new Integer(httpServletRequest.getParameter("u_id")));
            //Insert into table
            userService.updateUserById(user);

            sendResult(httpServletResponse, "{success: true, n_id: " + user.getU_id() + "}");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }






}
