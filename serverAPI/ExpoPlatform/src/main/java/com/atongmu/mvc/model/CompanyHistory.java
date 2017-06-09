package com.atongmu.mvc.model;

import java.util.Date;
/**
 * Created by yao on 6/10/17.
 */
public class CompanyHistory {

    private int chID;
    private int cID;
    private String chName;
    private String chAddress;
    private String chClient;
    private Date chStartTime;
    private Date chEndTime;
    private String chDesc;
    private String chPic;
    private String chPic2;
    private String chPic3;
    private String chCreatedBy;
    private Date chCreatedTime;
    private String chUpdatedBy;

    public int getChID() {
        return chID;
    }

    public void setChID(int chID) {
        this.chID = chID;
    }

    public int getcID() {
        return cID;
    }

    public void setcID(int cID) {
        this.cID = cID;
    }

    public String getChName() {
        return chName;
    }

    public void setChName(String chName) {
        this.chName = chName;
    }

    public String getChAddress() {
        return chAddress;
    }

    public void setChAddress(String chAddress) {
        this.chAddress = chAddress;
    }

    public String getChClient() {
        return chClient;
    }

    public void setChClient(String chClient) {
        this.chClient = chClient;
    }

    public Date getChStartTime() {
        return chStartTime;
    }

    public void setChStartTime(Date chStartTime) {
        this.chStartTime = chStartTime;
    }

    public Date getChEndTime() {
        return chEndTime;
    }

    public void setChEndTime(Date chEndTime) {
        this.chEndTime = chEndTime;
    }

    public String getChDesc() {
        return chDesc;
    }

    public void setChDesc(String chDesc) {
        this.chDesc = chDesc;
    }

    public String getChPic() {
        return chPic;
    }

    public void setChPic(String chPic) {
        this.chPic = chPic;
    }

    public String getChPic2() {
        return chPic2;
    }

    public void setChPic2(String chPic2) {
        this.chPic2 = chPic2;
    }

    public String getChPic3() {
        return chPic3;
    }

    public void setChPic3(String chPic3) {
        this.chPic3 = chPic3;
    }

    public String getChCreatedBy() {
        return chCreatedBy;
    }

    public void setChCreatedBy(String chCreatedBy) {
        this.chCreatedBy = chCreatedBy;
    }

    public Date getChCreatedTime() {
        return chCreatedTime;
    }

    public void setChCreatedTime(Date chCreatedTime) {
        this.chCreatedTime = chCreatedTime;
    }

    public String getChUpdatedBy() {
        return chUpdatedBy;
    }

    public void setChUpdatedBy(String chUpdatedBy) {
        this.chUpdatedBy = chUpdatedBy;
    }

    public Date getChUpdatedTime() {
        return chUpdatedTime;
    }

    public void setChUpdatedTime(Date chUpdatedTime) {
        this.chUpdatedTime = chUpdatedTime;
    }

    private Date chUpdatedTime;



}
