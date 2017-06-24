package com.atongmu.mvc.model;

import com.atongmu.mvc.util.DateUtil;

import java.util.Date;

/**
 * Created by yao on 6/22/17.
 */
public class Newest {

    private int n_id;
    private int n_from;
    private int n_to;
    private String n_message;
    private String n_created_by;
    private Date n_created_time;
    private String n_updated_by;
    private Date n_updated_time;

    public int getN_id() {
        return n_id;
    }

    public void setN_id(int n_id) {
        this.n_id = n_id;
    }

    public int getN_from() {
        return n_from;
    }

    public void setN_from(int n_from) {
        this.n_from = n_from;
    }

    public int getN_to() {
        return n_to;
    }

    public void setN_to(int n_to) {
        this.n_to = n_to;
    }

    public String getN_message() {
        return n_message;
    }

    public void setN_message(String n_message) {
        this.n_message = n_message;
    }

    public String getN_created_by() {
        return n_created_by;
    }

    public void setN_created_by(String n_created_by) {
        this.n_created_by = n_created_by;
    }

    public String getN_created_time() {
        return new DateUtil().formatDateToString(n_created_time, DateUtil.DATE_FORMAT_YMDHMS_TIME);
    }

    public void setN_created_time(Date n_created_time) {
        this.n_created_time = n_created_time;
    }

    public String getN_updated_by() {
        return n_updated_by;
    }

    public void setN_updated_by(String n_updated_by) {
        this.n_updated_by = n_updated_by;
    }

    public String getN_updated_time() {
        return new DateUtil().formatDateToString(n_updated_time, DateUtil.DATE_FORMAT_YMDHMS_TIME);
    }

    public void setN_updated_time(Date n_updated_time) {
        this.n_updated_time = n_updated_time;
    }
}
