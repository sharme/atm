package com.crawler.controller;

import com.crawler.m.CompanyInfo;
import com.crawler.util.StringUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzy on 17/5/22.
 */
interface ParseHtmlProgress{
    public void getCompanyInfo(List<CompanyInfo> infos);

    public void getCompanyAddress(List<CompanyInfo> infos);

    public void getCompanyInfoFinish(List<CompanyInfo> infos);
}

public class ParseHtml {
    public static void main(String[] args) {


        parseDetialHtml(null);
    }

    public static void parseHtml(ParseHtmlProgress parseHtmlProgress){
        List<CompanyInfo> compays;

        Document doc;
        try {
            compays = new ArrayList<>();
            for(int i=1;i<=18;i++){
                String url = "http://bbs.d7w.net/job/?sortid=47&orderby=dateline&page="+i;
                doc = Jsoup.connect(url).get();
                Elements ListDiv = doc.getElementsByAttributeValue("class","job_p1");
                for (Element element :ListDiv) {
                    Element links = element.getElementsByTag("a").first();
                    String cDetailUrl = links.attr("href");
                    String cName = links.text().trim();
                    CompanyInfo info = new CompanyInfo();
                    info.setcName(cName);
                    info.setcDetailUrl("http://bbs.d7w.net/"+cDetailUrl);
                    compays.add(info);
//                    System.out.println(cDetailUrl);
//                    System.out.println(cName);
                }
            }

            if(parseHtmlProgress != null){
                parseHtmlProgress.getCompanyInfo(compays);
            }

            for(CompanyInfo info:compays){
                doc = Jsoup.connect(info.getcDetailUrl()).get();

                Elements ListDiv = doc.getElementsByAttributeValue("class","liinfo");
                for (Element element :ListDiv) {

                    String linkText = element.text().trim();
                    if(linkText.startsWith("工作地点：")){
                        info.setcAddress(linkText.replace("工作地点：",""));
                    }else if(linkText.startsWith("公司网址：")){
                        info.setcWWW(linkText.replace("公司网址：",""));
                    }

                }
                if(parseHtmlProgress != null){
                    parseHtmlProgress.getCompanyAddress(compays);
                }
                ListDiv = doc.getElementsByAttributeValue("class","zliinfo");
                for (Element element :ListDiv) {

                    String linkText = element.text().trim();
                    if(linkText.startsWith("联系人：")){
                        info.setcUser(linkText.replace("联系人：",""));
                    }else if(linkText.startsWith("联系电话：")){
                        info.setcMobile(linkText.replace("联系电话：",""));
                    }else if(linkText.startsWith("联系邮箱：")){
                        info.setcEmail(linkText.replace("联系邮箱：",""));
                    }else if(linkText.startsWith("联系QQ：")){
                        info.setcQQ(linkText.replace("联系QQ：",""));
                    }

                }
                System.out.println("---------------------------------------");
                System.out.println(info.toString());
            }

            if(parseHtmlProgress != null){
                parseHtmlProgress.getCompanyInfoFinish(compays);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void parseDetialHtml(ParseHtmlProgress parseHtmlProgress){
        List<String> compaysUrl;

        Document doc;
        try {
            compaysUrl = new ArrayList<>();
            for (int i = 1; i <= 3; i++) {
                String url = "http://www.d7w.net/index.php?a=lists&catid=52&page=" + i;
                doc = Jsoup.connect(url).get();
                Elements ListDiv = doc.getElementsByAttributeValue("class", "img");
                for(Element el:ListDiv){
                    if(el.childNodes().size() > 0){
                        String str = el.child(0).attr("href");
                        if(str != null && !str.equalsIgnoreCase("")){
                            compaysUrl.add(str);
                        }else{
                            continue;
                        }

                    }else{
                        continue;
                    }

                }
            }

            List<CompanyInfo> infos = new ArrayList<>();

            for(String url:compaysUrl){
                CompanyInfo info = new CompanyInfo();
                doc = Jsoup.connect(url).get();

                Elements ListDiv = doc.getElementsByAttributeValue("class","designer_r cyl_gs_data fr");
                String www = ListDiv.get(0).childNode(1).childNode(6).childNode(1).childNode(2).attr("href").trim();
                info.setcWWW(www);

                if(!StringUtil.isNoEmpty(www)){
                    continue;
                }

                String logUrl = "http://www.d7w.net/" + ListDiv.get(0).childNode(1).childNode(1).childNode(1).childNode(1).attr("src");

                info.setcLogoUrl(logUrl);



                String email = ListDiv.get(0).childNode(1).childNode(8).childNode(1).childNode(1).attr("text");
                info.setcEmail(email);

                Node node = ListDiv.get(0).childNode(1).childNode(8).childNode(3).childNode(1);

                String mobile = "";
                if(node.childNodes().size()>0){
                    mobile = node.childNode(0).attr("text");
                }
                info.setcMobile(mobile);

                String qq = "";
                node = ListDiv.get(0).childNode(1).childNode(8).childNode(5).childNode(1);
                if(node.childNodes().size()>0){
                    qq = node.childNode(0).attr("text");
                }
                info.setcQQ(qq);
                ListDiv = doc.getElementsByAttributeValue("class","parameter clearfix");

                node = ListDiv.get(0).childNode(3).childNode(0);
                String renqi = "";
                if(node.childNodes().size()>0){
                    renqi = node.childNode(0).attr("text");
                }
                info.setcPopularity(renqi);

                node = ListDiv.get(0).childNode(5).childNode(0);
                String orders = "";
                if(node.childNodes().size()>0){
                    orders = node.childNode(0).attr("text");
                }
                info.setcOrderCount(orders);

                node = ListDiv.get(0).childNode(7).childNode(0);
                String bidCount = "";
                if(node.childNodes().size()>0){
                    bidCount = node.childNode(0).attr("text");
                }
                info.setcBidCount(bidCount);

                infos.add(info);
                System.out.println(info.toString());
            }

            if(parseHtmlProgress != null){
                parseHtmlProgress.getCompanyInfoFinish(infos);
            }
        }catch (Exception ex){

            ex.printStackTrace();
        }
    }

    public static List<CompanyInfo> parseLogo(List<CompanyInfo> infos){
        Document doc;
        for(CompanyInfo info:infos){
            try {
                doc = Jsoup.connect(info.getcDetailUrl()).get();
                Elements elements = doc.getElementsByAttributeValue("alt","公司标志");
                Element el = elements.get(0);
                String urlStr = el.attr("src");

                info.setcLogoUrl("http://bbs.d7w.net/"+urlStr);
                try {
                    doc = Jsoup.connect(info.getcWWW()).get();
                    Node node = doc.childNode(1);
                    node = node.childNode(node.childNodeSize()-1);
                    if(node.childNodeSize()>1){
                        info.setcMain(1);
                    }else{
                        info.setcMain(0);
                    }

                }catch (Exception ex) {
                    info.setcMain(0);
                }
                System.out.println("index:"+info.getcID());
            }catch (Exception ex){

                System.out.println("error-index:"+info.getcID());
            }

        }
        return infos;
    }
}
