package com.atongmu.mvc.controller;

import com.atongmu.mvc.model.Role;
import com.atongmu.mvc.model.User;
import com.atongmu.mvc.service.Impl.RoleServiceImpl;
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
public class RoleController extends BaseController{


    @Autowired
    RoleServiceImpl roleService;

    @RequestMapping(value = "/getRoles", method = RequestMethod.GET)
    public void getEvents(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        try {

            List<Role> roles = roleService.getRoles();
            sendResult(httpServletResponse, JSONArray.fromObject(roles).toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
