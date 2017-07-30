package com.atongmu.mvc.filter;

import com.atongmu.mvc.util.SecretGenerator;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by yao on 7/6/17.
 */
public class secretRequestFilter extends HttpServlet implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("init secret request filter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {


        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        String secret = "";
        if(httpServletRequest.getParameter("secret") != null)
             secret = new String(httpServletRequest.getParameter("secret").getBytes("iso-8859-1"), "utf-8");

        SecretGenerator des = new SecretGenerator("qwert123qwe");



        try {

            System.out.println("secret: " + secret + ", result: " + des.decrypt(secret));


            if (des.decrypt(secret).equals("atm"))
                filterChain.doFilter(servletRequest, servletResponse);
            else
                httpServletResponse.sendError(500, "[{code: 500, error: access denied}]");
            return;

        }catch (Exception e){
            httpServletResponse.sendError(501, "[{code: 501, error: illegal access denied}]");
        }
    }
}
