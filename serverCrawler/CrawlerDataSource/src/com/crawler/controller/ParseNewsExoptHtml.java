package com.crawler.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class ParseNewsExoptHtml{

    public static void main(String[] args) {


        parseHtml();

    }

    public static void parseHtml(){
        String url = "http://www.showguide.cn/zhChina/list_1.html";
        List<String> urls = new ArrayList<>();
        Document doc;
        try {

            doc = Jsoup.connect(url).get();
            Elements ListDiv = doc.getElementsByAttributeValue("class","exh_list");

            for(Element el : ListDiv){
                Element pic = el.getElementById("transBox_piclist3");

                //详情url
                if(pic.childNodeSize()>1){
                    Node node = pic.childNode(1);
                    String imgUr = node.attr("href");

                    if(imgUr!=null && imgUr.length()>0){
                        urls.add("http://www.showguide.cn"+imgUr);
                    }
                    System.out.println("aaa"+imgUr);
                }
            }

            for(String htmlUrl:urls){
                doc = Jsoup.connect(htmlUrl).get();
                Elements detail = doc.getElementsByAttributeValue("class","detail_head");
                if(detail.size()<2){
                    continue;
                }
                Element detailEl = detail.get(0);

                //获取图片集
                List<String> imgUrls = new ArrayList<>();
                Elements els = detailEl.getElementsByAttributeValue("class","DB_thumMove");
                if(els.size()>0){
                    Element nodes = els.get(0);

                    for(Node el:nodes.childNodes()){
                        if(el.childNodeSize()>1){
                            Node node = el.childNode(1);
//                            if(node.childNodeSize()>1){
//                                node = node.childNode(1);
//                            }
                            String imgUrl = node.attr("href");
                            imgUrls.add(imgUrl);
                        }

                    }
                }

                //获取标题

                detailEl = detail.get(1);

                Elements elTitle = detailEl.getElementsByAttributeValue("class","d_r_t");


            }

        }catch (Exception ex){

            ex.printStackTrace();
        }
    }
}