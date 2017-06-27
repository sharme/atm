package com.atongmu.mvc.model;

import com.atongmu.mvc.util.DateUtil;

import java.util.Date;

/**
 * Created by yao on 6/25/17.
 */
public class Feedback {

    private int f_id;
    private int u_id;
    private String f_msg;
    private String f_created_by;
    private Date f_created_time;
    private String f_updated_by;
    private Date f_updated_time;

    public int getF_id() {
        return f_id;
    }

    public void setF_id(int f_id) {
        this.f_id = f_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getF_msg() {
        return f_msg;
    }

    public void setF_msg(String f_msg) {
        this.f_msg = f_msg;
    }

    public String getF_created_by() {
        return f_created_by;
    }

    public void setF_created_by(String f_created_by) {
        this.f_created_by = f_created_by;
    }

    public String getF_created_time() {
        return new DateUtil().formatDateToString(f_created_time, DateUtil.DATE_FORMAT_YMDHMS_TIME);
    }

    public void setF_created_time(Date f_created_time) {
        this.f_created_time = f_created_time;
    }

    public String getF_updated_by() {
        return f_updated_by;
    }

    public void setF_updated_by(String f_updated_by) {
        this.f_updated_by = f_updated_by;
    }

    public String getF_updated_time() {
        return new DateUtil().formatDateToString(f_updated_time, DateUtil.DATE_FORMAT_YMDHMS_TIME);
    }

    public void setF_updated_time(Date f_updated_time) {
        this.f_updated_time = f_updated_time;
    }
}
