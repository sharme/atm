package com.atongmu.mvc.controller;

import com.atongmu.mvc.model.Designer;
import com.atongmu.mvc.model.Exhibitor;
import com.atongmu.mvc.service.Impl.DesignerServiceImpl;
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
public class DesignerController extends BaseController{


    @Autowired
    DesignerServiceImpl designerService;

    @RequestMapping(value = "/getDesigners", method = RequestMethod.GET)
    public void getDesigners(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        try {

            int count = new Integer(httpServletRequest.getParameter("count"));
            int start = new Integer(httpServletRequest.getParameter("start"));
            String type = null;
            if(httpServletRequest.getParameter("type") != null)
                type = new String(httpServletRequest.getParameter("type").getBytes("iso-8859-1"), "utf-8");
            String city = null;
            if(httpServletRequest.getParameter("city") != null)
                city = new String(httpServletRequest.getParameter("city").getBytes("iso-8859-1"), "utf-8");

            List<Designer> designers = designerService.getDesigners(start, count, type, city);
            sendResult(httpServletResponse, JSONArray.fromObject(designers).toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @RequestMapping(value = "/getDesignerById", method = RequestMethod.GET)
    public void getDesignerById(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        try {
            Designer designer = designerService.getDesignerById(new Integer(httpServletRequest.getParameter("id")));
            sendResult(httpServletResponse, JSONArray.fromObject(designer).toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @RequestMapping(value = "/getDesignerByUId", method = RequestMethod.GET)
    public void getDesignerByUId(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        try {
            Designer designer = designerService.getDesignerByUId(new Integer(httpServletRequest.getParameter("u_id")));
            sendResult(httpServletResponse, JSONArray.fromObject(designer).toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/getDesignerNumber", method = RequestMethod.GET)
    public void getDesignerNumber(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        try {
            int total = designerService.getDesignerNumber();
            sendResult(httpServletResponse, "[{total: "+ total +"}]");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
