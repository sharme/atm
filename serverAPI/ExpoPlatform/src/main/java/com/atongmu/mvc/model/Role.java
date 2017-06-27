package com.atongmu.mvc.model;

import com.atongmu.mvc.util.DateUtil;

import java.util.Date;

/**
 * Created by yao on 6/27/17.
 */
public class Role {

    private int r_id;
    private String r_name;
    private String r_desc;
    private String r_created_by;
    private Date r_created_time;
    private String r_updated_by;
    private Date r_updated_time;

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

//    public String getR_desc() {
//        return r_desc;
//    }
//
//    public void setR_desc(String r_desc) {
//        this.r_desc = r_desc;
//    }

//    public String getR_created_by() {
//        return r_created_by;
//    }

//    public void setR_created_by(String r_created_by) {
//        this.r_created_by = r_created_by;
//    }
//
//    public String getR_created_time() {
//        return new DateUtil().formatDateToString(r_created_time, DateUtil.DATE_FORMAT_YMDHMS_TIME);
//    }

//    public void setR_created_time(Date r_created_time) {
//        this.r_created_time = r_created_time;
//    }
//
//    public String getR_updated_by() {
//        return r_updated_by;
//    }
//
//    public void setR_updated_by(String r_updated_by) {
//        this.r_updated_by = r_updated_by;
//    }
//
//    public String getR_updated_time() {
//        return new DateUtil().formatDateToString(r_updated_time, DateUtil.DATE_FORMAT_YMDHMS_TIME);
//    }
//
//    public void setR_updated_time(Date r_updated_time) {
//        this.r_updated_time = r_updated_time;
//    }
}
