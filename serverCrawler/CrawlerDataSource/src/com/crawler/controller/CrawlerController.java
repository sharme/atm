package com.crawler.controller;

import com.crawler.m.CompanyInfo;
import com.crawler.services.CompanyInfoService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzy on 17/5/27.
 */
@Controller
public class CrawlerController extends BaseHotController{

    @Autowired
    private CompanyInfoService companyInfoService;

    @RequestMapping(value = "/crawlerdata", method = RequestMethod.GET)
    public String crawlerView(){
        List<CompanyInfo> list = companyInfoService.select();
        return "crawlerdata";
    }

    @RequestMapping(value = "/crawlerDesignCompany", method = RequestMethod.GET)
    public void crawlerData(final HttpServletResponse response){


//        List<CompanyInfo> list = new ArrayList<>();
//
//        CompanyInfo info = new CompanyInfo();
//        info.setcAddress("我那会计师电话费黄金时代");
//        info.setcQQ("QQ");
//        info.setcDetailUrl("detail");
//        info.setcEmail("email");
//        info.setcMobile("mobile");
//        info.setcName("name");
//        info.setcUser("user");
//        info.setcWWW("www");
//        list.add(info);
//        companyInfoService.addCompanyInfo(list);
//
//        sendResult(response,"ss","code","爬虫成功");

        ParseHtml.parseHtml(new ParseHtmlProgress() {
            @Override
            public void getCompanyInfo(List<CompanyInfo> infos) {

            }

            @Override
            public void getCompanyAddress(List<CompanyInfo> infos) {

            }

            @Override
            public void getCompanyInfoFinish(List<CompanyInfo> infos) {


                JSONArray array = JSONArray.fromObject(infos);

                int count = companyInfoService.addCompanyInfo(infos);

                sendResult(response,"抓取 "+count+" 条","code","爬虫成功");
            }
        });
    }

    @RequestMapping(value = "/crawlerDesignCompanyDetail", method = RequestMethod.GET)
    public void crawlerDetailData(final HttpServletResponse response){



        ParseHtml.parseDetialHtml(new ParseHtmlProgress() {
            @Override
            public void getCompanyInfo(List<CompanyInfo> infos) {

            }

            @Override
            public void getCompanyAddress(List<CompanyInfo> infos) {

            }

            @Override
            public void getCompanyInfoFinish(List<CompanyInfo> infos) {

                int cunt = companyInfoService.updateWWWCompany(infos);

                sendResult(response,"查询 "+cunt+" 条","code","爬虫成功");

            }
        });



    }

    @RequestMapping(value = "/crawlerAddress", method = RequestMethod.GET)
    public void crawlerAddress(final HttpServletResponse response, final HttpServletRequest request){
        String path = request.getSession().getServletContext().getRealPath("areas.json");

        File file = new File(path);
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append(System.lineSeparator()+s);
            }
            br.close();
            String str = result.toString().trim();
            str = str.replace("\n","");
            str = str.replace(" ","");
            JSONArray jsonArray = JSONArray.fromObject(str);

            List<AreaInfo> list = new ArrayList<>();
            List<AreaInfo> city = new ArrayList<>();
            List<AreaInfo> area = new ArrayList<>();
            for(int i=0;i<jsonArray.size();i++){
                JSONObject jsonPro = jsonArray.getJSONObject(i);
                list.add(new AreaInfo(jsonPro));
                JSONArray citys = jsonPro.getJSONArray("subarea");
                for(int j=0;j<citys.size();j++){
                    JSONObject jsoncity = citys.getJSONObject(j);
                    city.add(new AreaInfo(jsoncity));
                    JSONArray areas = jsoncity.getJSONArray("subarea");
                    for(int h=0;h<areas.size();h++){
                        JSONObject jsonAreas = areas.getJSONObject(h);
                        area.add(new AreaInfo(jsonAreas));
                    }
                }
            }

            companyInfoService.addPro(list,"address_pro");
            companyInfoService.addPro(city,"address_city");
            companyInfoService.addPro(area,"address_area");

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/crawlerLogo", method = RequestMethod.GET)
    public void crawlerLogo(final HttpServletResponse response, final HttpServletRequest request){

        List<CompanyInfo> lists = companyInfoService.select();

        lists = ParseHtml.parseLogo(lists);

        companyInfoService.updateWWWCompany(lists);

        System.out.println("aaa");

    }
}
