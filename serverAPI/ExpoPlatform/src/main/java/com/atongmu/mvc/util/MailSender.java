package com.atongmu.mvc.util;

import javax.mail.Session;
import javax.mail.internet.*;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.Address;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class MailSender{


    // Read any html templates
    public static String readTemplate(String template){

        StringBuffer buff = new StringBuffer();
        InputStreamReader in = null;
        BufferedReader br = null;
        String path = "/Users/yao/coding/atm/serverAPI/ExpoPlatform/src/main/resources/templates/" + template;

        File file=new File(path);
        try {
            in=new InputStreamReader(new FileInputStream(file));
            br=new BufferedReader(in);
            String line=null;
            while((line=br.readLine()) != null){
                buff.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return buff.toString();
    }
    // Mail sending
    public static void send(String to, String subject, String mailTemplate) throws MessagingException, UnsupportedEncodingException {

        Properties props = new Properties();
        props.setProperty("mail.debug", "true");
        props.setProperty("mail.smtp.auth", "true");
        props.setProperty("mail.host", "smtp.mxhichina.com");
        props.setProperty("mail.transport.protocol", "smtp");

        Session session = Session.getInstance(props);
        Message msg = new MimeMessage(session);
        msg.setSentDate(new Date());
        msg.setSubject(MimeUtility.encodeText(subject, "utf-8", "B"));
        //Multipart will compatible HTML contents
        Multipart mainPart = new MimeMultipart();
        BodyPart body=new MimeBodyPart();
        body.setContent(mailTemplate,"text/html;charset=utf-8");
        mainPart.addBodyPart(body);
        msg.setContent(mainPart);
        msg.setFrom(new InternetAddress("fmyoutu@fmyoutu.com"));

        Transport transport = session.getTransport();
        // connect to mail server
        transport.connect("fmyoutu@fmyoutu.com", "123QWEqwe");
        transport.sendMessage(msg, new Address[] {new InternetAddress(to)});
        transport.close();

    }
    // reset html template
    public static String resetHTML(String resetLink){

        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<p></p>\n" +
                "<br>\n" +
                "您发起了重置邮箱密码请求, 如果是您本人操作. 请点击一下链接完成重置密码操作.\n" +
                "<br>\n" +
                resetLink +
                "<p></p>\n" +
                "<br>\n" +
                "如果这不是您本人操作, 请忽略该邮箱. 如有问题请发信admin@fmyoutu.com 谢谢\n" +
                "<br>\n" +
                "<br>\n" +
                "<br>\n" +
                "58阿童木团队\n" +
                "\n" +
                "</body>\n" +
                "</html>";

    }

    public static String welcomeHTML(String username, String welLink){

        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "Hey,\n" + username +
                "<br>\n" +
                "<br>\n" +
                "欢迎您注册成为58阿童木用户, 您的账号需要邮箱认证, 点击下面链接进行认证：\n" +
                "\n" +
                "<br>\n" +
                "<br>\n" +
                welLink +
                "<br>\n" +
                "<br>\n" +
                "\n" +
                "如果链接无法点击，请完整拷贝到浏览器地址栏里直接访问\n" +
                "<br>\n" +
                "<br>\n" +
                "<br>\n" +
                "如果这不是您本人操作, 请忽略这封邮件. 如有问题请联系 admin@fmyoutu.com\n" +
                "<br>\n" +
                "<br>\n" +
                "<br>\n" +
                "<br>\n" +
                "58阿童木团队\n" +
                "\n" +
                "</body>\n" +
                "</html>";

    }

    public static void main(String args[] ) throws Exception {

        send("yaomiwang@qq.com", "重置密码！ 58阿童木", welcomeHTML("miwang", "http://www.d7w.net/index.php?g=Member&a=verifyemail&key=18d3m07bgzHDCOkL1Tr3hYhGxa6RkBLx%2Fa0wykOroR1ghHNdriAgujUlsl2zR3TZfa1oc%2Fdu8tnHi6ZbqHY\n"));
    }


}