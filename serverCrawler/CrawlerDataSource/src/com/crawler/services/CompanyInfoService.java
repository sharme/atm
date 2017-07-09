package com.crawler.services;

import com.crawler.controller.AreaInfo;
import com.crawler.m.CompanyInfo;
import com.crawler.dao.BaseDaoImpl;
import com.crawler.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

interface CompanyInfoServiceI{
    public int addCompanyInfo(List<CompanyInfo> infos);

    public int addPro(List<AreaInfo> list,String tableName);
}

/**
 * Created by lzy on 17/5/28.
 */

@Service
public class CompanyInfoService implements CompanyInfoServiceI{

    static String insert_sql = "insert into company_design(cName,cDetailUrl,cAddress,cMobile,cWWW,cUser,cQQ,cEmail) values(";

    static String select_sql = "select * from company_design where 1=1 ";

//    @Autowired
//    private JdbcTemplate simpleJdbcTemplate;
//
//
//    @Resource(name="simpleJdbcTemplate")
//    public void setSimpleJdbcTemplate(JdbcTemplate simpleJdbcTemplate) {
//        this.simpleJdbcTemplate = simpleJdbcTemplate;
//    }

    @Autowired
    private BaseDaoImpl baseDao;

    public int addCompanyInfo(List<CompanyInfo> infos){

        Integer count = 0;
        for(CompanyInfo info:infos){
            try {
                String sql = insert_sql+"'"+ info.getcName()+"','"+info.getcDetailUrl()+"','"+info.getcAddress()+
                        "','"+info.getcMobile()+"','"+info.getcWWW()+"','"+info.getcUser()+"','"+info.getcQQ()+"','"+info.getcEmail()
                        +"');";
                count = baseDao.saveOrUpdateObject(sql);
            }catch (Exception ex){

                System.out.println(ex.getMessage());
            }


        }


        return count;
    }

    public List<CompanyInfo> select(){
        return baseDao.getObjList(select_sql,CompanyInfo.class,null);
    }

    public int updateWWWCompany(List<CompanyInfo> infos){

        int i=0;
        for(CompanyInfo info:infos){

            if(!StringUtil.isNoEmpty(info.getcLogoUrl())){
                continue;
            }
            StringBuilder selSql = new StringBuilder("update company_design set ");

//            if(StringUtil.isNoEmpty(info.getcEmail()) && info.getcEmail().length()>3){
//                selSql.append("cEmail='"+info.getcEmail()+"',");
//            }
//            if(StringUtil.isNoEmpty(info.getcMobile()) && info.getcMobile().length()>3){
//                selSql.append("cMobile='"+info.getcMobile()+"',");
//            }
//            if(StringUtil.isNoEmpty(info.getcBeGoodAt())){
//                selSql.append("cBeGoodAt='"+info.getcBeGoodAt()+"',");
//            }
            if(StringUtil.isNoEmpty(info.getcLogoUrl()) && info.getcEmail().length()>1){
                selSql.append("cLogoUrl='"+info.getcLogoUrl()+"'");
            }
//            if(StringUtil.isNoEmpty(info.getcTurnover())){
//                selSql.append("cTurnover='"+info.getcTurnover()+"',");
//            }
//            if(StringUtil.isNoEmpty(info.getcQQ()) && info.getcQQ().length()>3){
//                selSql.append("cQQ='"+info.getcQQ()+"',");
//            }
//            if(StringUtil.isNoEmpty(info.getcManagementDirection())){
//                selSql.append("cManagementDirection='"+info.getcManagementDirection()+"',");
//            }
//            if(StringUtil.isNoEmpty(info.getcPopularity())){
//                selSql.append("cPopularity='"+info.getcPopularity()+"',");
//            }
//            if(StringUtil.isNoEmpty(info.getcOrderCount())){
//                selSql.append("cOrderCount='"+info.getcOrderCount()+"',");
//            }
//            if(StringUtil.isNoEmpty(info.getcBidCount())){
//                selSql.append("cBidCount='"+info.getcBidCount()+"',");
//            }

            //获取公司名称 不存在并insert
            selSql.append(" ,cMain=" + info.getcMain());
            selSql.append(" where cID = "+info.getcID());
            Integer a=baseDao.saveOrUpdateObject(selSql.toString());
            if(a>0){
                i++;
            }
        }


        return i;
    }

    @Override
    public int addPro(List<AreaInfo> list, String tableName) {
        Integer count = 0;

        for(AreaInfo info:list){
            try {
                String sql = "insert into " + tableName +"(id,level,name,parent_id,postcode) values(" + info.getId()+",'"+info.getLevel()+"','"+info.getName()+
                        "',"+info.getParent_id()+",'"+info.getPostcode()+"');";
                count += baseDao.saveOrUpdateObject(sql);
            }catch (Exception ex){

                System.out.println(ex.getMessage());
            }


        }

        return count;
    }

    //    public Integer updateFor
}
