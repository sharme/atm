package com.atongmu.mvc.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

/**
 * 短信发送工具
 * @author junxian
 *
 */
public class MessageSendUtil {
	/**
	 * 没有该用户
	 */
	public static int MESSAGE_CODE_NOUSER=-1;
	/**
	 * 接口密钥不正确
	 */
	public static int MESSAGE_CODE_KEY_ERROR=-2;
	/**
	 * MD5接口密钥加密不正确
	 */
	public static int MESSAGE_CODE_MD5_ERROR=-21;
	/**
	 * 短信数量不足
	 */
	public static int MESSAGE_CODE_NUMBER_ERROR=-3;
	/**
	 * 该用户被禁用
	 */
	public static int MESSAGE_CODE_FORBIDDEN=-11;
	/**
	 * 短信内容出现非法字符
	 */
	public static int MESSAGE_CODE_CONTENT_ILLEGAL=-14;
	/**
	 * 手机号格式不正确
	 */
	public static int MESSAGE_CODE_PHONE_ERROR=-41;
	/**
	 * 手机号码为空
	 */
	public static int MESSAGE_CODE_PHONE_NULL=-42;
	/**
	 * 短信签名格式不正确
	 */
	public static int MESSAGE_CODE_CONTENT_FORMAT_ERROR=-51;
	/**
	 * IP限制
	 */
	public static int MESSAGE_CODE_IP_LIMIT=-6;

	//http://utf8.sms.webchinese.cn/?Uid=本站用户名&Key=接口安全密码&smsMob=手机号码&smsText=短信内容
	static String message_url="http://utf8.sms.webchinese.cn/";
	
	static String message_key="16fa221770b83ae0483f";
	
	static String message_userName="junxianalan";
	
	
	
	/**
	 * 
	 * @param phone
	 * @param messageCode
	 * @return 发送短信验证码
	 */
	public static int sendMessageCode(String phone,String messageCode){
		int resultCode=1000;
		//GET请求
		String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = message_url+"?Uid="+message_userName+"&Key="+message_key+"&smsMob="+phone+"&smsText="+URLEncoder.encode(messageCode,"utf-8");
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
		try{
			resultCode=Integer.parseInt(result);
		}catch (Exception e) {
			// TODO: handle exception
		}
		LoggerUtil.info("发送短信返回码:"+result);
		return resultCode;
	}
}
