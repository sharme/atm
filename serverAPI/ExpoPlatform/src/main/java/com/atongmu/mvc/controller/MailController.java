package com.atongmu.mvc.controller;

import com.atongmu.mvc.util.MailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.misc.Request;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by yao on 6/18/17.
 */

@Controller
public class MailController extends BaseController{


    @RequestMapping(value = "/sendWelcome", method = RequestMethod.GET)
    public void sendWelcome(HttpServletResponse res) throws Exception {

        MailSender.send("yaomiwang@qq.com", "重置密码！58阿童木", MailSender.welcomeHTML("miwang", "http://www.d7w.net/index.php?g=Member&a=verifyemail&key=18d3m07bgzHDCOkL1Tr3hYhGxa6RkBLx%2Fa0wykOroR1ghHNdriAgujUlsl2zR3TZfa1oc%2Fdu8tnHi6ZbqHY\n"));
        sendResult(res, "{code: 001, success: true }");

    }

}
