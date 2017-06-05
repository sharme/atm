package com.atongmuweb.mvc.controller;

import java.io.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONObject;

/**
 * Created by lzy on 17/6/1.
 */
public class BaseController {
    /**
     *
     * @param request 请求对象
     * @return 获取请求参数
     */
    public static String getRequestBodyParam(HttpServletRequest request){
        StringBuffer sb=new StringBuffer();
        try {
            //接收数据
            InputStream is=request.getInputStream();
            InputStreamReader ir=new InputStreamReader(is,"utf-8");
            BufferedReader br=new BufferedReader(ir);
            String line = "";
            for (line = br.readLine(); line != null; line = br.readLine()) {
                sb.append(line);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return sb.toString();
    }

    /**
     *
     * @param response 响应给客户端
     * @param resultJson 发送的参数
     * @return 发送数据给客户端
     */
    public void sendResult(HttpServletResponse response, String resultJson){
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        PrintWriter pw=null;
        try {
            pw=response.getWriter();
            pw.print(resultJson);
        } catch (Exception e) {
            // TODO: handle exception
        }finally{
            if(pw!=null){
                pw.close();
            }
        }
    }

    /**
     * 响应消息给客户端
     * @param response
     * @param data
     * @param code
     * @param message
     */
    public void sendResult(HttpServletResponse response, String data, String code, String message){

        JSONObject jsonObject= new JSONObject();
        jsonObject.put("data",data);
        jsonObject.put("code",code);
        jsonObject.put("message",message);
        this.sendResult(response,jsonObject.toString());
    }

    public void sendResultError(HttpServletResponse response){
        JSONObject jsonObject= new JSONObject();
        jsonObject.put("data","");
        jsonObject.put("code","500");
        jsonObject.put("message","服务器维护中");
        this.sendResult(response,jsonObject.toString());
    }
}
