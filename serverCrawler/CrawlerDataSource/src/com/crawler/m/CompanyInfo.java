package com.crawler.m;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by lzy on 17/5/23.
 */
public class CompanyInfo  implements Serializable {



    /**
     *
     */
    private static final long serialVersionUID = 2317865512640004211L;

    private Integer cID;
    private String cName;
    private String cDetailUrl;

    private String cAddress;
    private String cMobile;
    private String cWWW;

    private String cUser;
    private String cQQ;
    private String cEmail;

    private String cPopularity;
    private String cOrderCount;
    private String cBidCount;

    private String cCreateDate;
    private String cManagementDirection;
    private String cTurnover;

    private String cBeGoodAt;
    private String cLogoUrl;
    private int cMain;


    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcDetailUrl() {
        return cDetailUrl;
    }

    public void setcDetailUrl(String cDetailUrl) {
        this.cDetailUrl = cDetailUrl;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public String getcMobile() {
        return cMobile;
    }

    public void setcMobile(String cMobile) {
        this.cMobile = cMobile;
    }

    public String getcWWW() {
        return cWWW;
    }

    public void setcWWW(String cWWW) {
        this.cWWW = cWWW;
    }

    public String getcUser() {
        return cUser;
    }

    public void setcUser(String cUser) {
        this.cUser = cUser;
    }

    public String getcQQ() {
        return cQQ;
    }

    public void setcQQ(String cQQ) {
        this.cQQ = cQQ;
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public Integer getcID() {
        return cID;
    }

    public void setcID(Integer cID) {
        this.cID = cID;
    }

    public String getcPopularity() {
        return cPopularity;
    }

    public void setcPopularity(String cPopularity) {
        this.cPopularity = cPopularity;
    }

    public String getcOrderCount() {
        return cOrderCount;
    }

    public void setcOrderCount(String cOrderCount) {
        this.cOrderCount = cOrderCount;
    }

    public String getcBidCount() {
        return cBidCount;
    }

    public void setcBidCount(String cBidCount) {
        this.cBidCount = cBidCount;
    }

    public String getcCreateDate() {
        return cCreateDate;
    }

    public void setcCreateDate(String cCreateDate) {
        this.cCreateDate = cCreateDate;
    }

    public String getcManagementDirection() {
        return cManagementDirection;
    }

    public void setcManagementDirection(String cManagementDirection) {
        this.cManagementDirection = cManagementDirection;
    }

    public String getcTurnover() {
        return cTurnover;
    }

    public void setcTurnover(String cTurnover) {
        this.cTurnover = cTurnover;
    }

    public String getcBeGoodAt() {
        return cBeGoodAt;
    }

    public void setcBeGoodAt(String cBeGoodAt) {
        this.cBeGoodAt = cBeGoodAt;
    }

    public String getcLogoUrl() {
        return cLogoUrl;
    }

    public void setcLogoUrl(String cLogoUrl) {
        this.cLogoUrl = cLogoUrl;
    }

    public int getcMain() {
        return cMain;
    }

    public void setcMain(int cMain) {
        this.cMain = cMain;
    }

    @Override
    public String toString() {
        String info = this.cName +"\n"+this.cAddress+"\n"+this.cUser+"\n"+this.cMobile+"\n"+this.cEmail+"\n"+this.cQQ;
        return info;
    }

    public CompanyInfo mapRow(ResultSet resultSet, int i) throws SQLException {
        CompanyInfo model = new CompanyInfo();

        model.setcID(resultSet.getInt("cID"));
        model.setcName(resultSet.getString("cName"));
        model.setcUser(resultSet.getString("cUser"));

        model.setcWWW(resultSet.getString("cWWW"));
        model.setcMobile(resultSet.getString("cMobile"));
        model.setcQQ(resultSet.getString("cQQ"));

        model.setcMobile(resultSet.getString("cMobile"));
        model.setcAddress(resultSet.getString("cAddress"));
        model.setcEmail(resultSet.getString("cEmail"));

        model.setcTurnover(resultSet.getString("cTurnover"));
        model.setcPopularity(resultSet.getString("cPopularity"));
        model.setcOrderCount(resultSet.getString("cOrderCount"));

        model.setcManagementDirection(resultSet.getString("cManagementDirection"));
        model.setcCreateDate(resultSet.getString("cCreateDate"));
        model.setcBidCount(resultSet.getString("cBidCount"));

        model.setcDetailUrl(resultSet.getString("cDetailUrl"));

        model.setcBeGoodAt(resultSet.getString("cBeGoodAt"));
        model.setcLogoUrl(resultSet.getString("cLogoUrl"));
        model.setcMain(resultSet.getInt("cMain"));

        return model;
    }
}
