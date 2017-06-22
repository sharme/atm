package com.atongmu.mvc.model;

import java.util.Date;

/**
 * Created by yao on 6/22/17.
 */
public class Newest {

    private int nID;
    private int nFrom;
    private int nTo;
    private String nMessage;
    private String nCreatedBy;
    private Date nCreatedTime;
    private String nUpdatedBy;
    private Date nUpdatedTime;

    public int getnID() {
        return nID;
    }

    public void setnID(int nID) {
        this.nID = nID;
    }

    public int getnFrom() {
        return nFrom;
    }

    public void setnFrom(int nFrom) {
        this.nFrom = nFrom;
    }

    public int getnTo() {
        return nTo;
    }

    public void setnTo(int nTo) {
        this.nTo = nTo;
    }

    public String getnMessage() {
        return nMessage;
    }

    public void setnMessage(String nMessage) {
        this.nMessage = nMessage;
    }

    public String getnCreatedBy() {
        return nCreatedBy;
    }

    public void setnCreatedBy(String nCreatedBy) {
        this.nCreatedBy = nCreatedBy;
    }

    public Date getnCreatedTime() {
        return nCreatedTime;
    }

    public void setnCreatedTime(Date nCreatedTime) {
        this.nCreatedTime = nCreatedTime;
    }

    public String getnUpdatedBy() {
        return nUpdatedBy;
    }

    public void setnUpdatedBy(String nUpdatedBy) {
        this.nUpdatedBy = nUpdatedBy;
    }

    public Date getnUpdatedTime() {
        return nUpdatedTime;
    }

    public void setnUpdatedTime(Date nUpdatedTime) {
        this.nUpdatedTime = nUpdatedTime;
    }
}
