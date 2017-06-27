package com.atongmu.mvc.model;

import com.atongmu.mvc.util.DateUtil;

import java.util.Date;

/**
 * Created by yao on 6/27/17.
 */
public class Designer {

    private int d_id;
    private int u_id;
    private String d_name;
    private int d_age;
    private String d_type;
    private String d_desc;
    private String d_country;
    private String d_province;
    private String d_city;
    private String d_pic;
    private String d_pic2;
    private String d_pic3;
    private String d_created_by;
    private Date d_created_time;
    private String d_updated_by;
    private Date d_updated_time;

    public String getD_country() {
        return d_country;
    }

    public void setD_country(String d_country) {
        this.d_country = d_country;
    }

    public String getD_province() {
        return d_province;
    }

    public void setD_province(String d_province) {
        this.d_province = d_province;
    }

    public String getD_city() {
        return d_city;
    }

    public void setD_city(String d_city) {
        this.d_city = d_city;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public int getD_age() {
        return d_age;
    }

    public void setD_age(int d_age) {
        this.d_age = d_age;
    }

    public String getD_type() {
        return d_type;
    }

    public void setD_type(String d_type) {
        this.d_type = d_type;
    }

    public String getD_desc() {
        return d_desc;
    }

    public void setD_desc(String d_desc) {
        this.d_desc = d_desc;
    }

    public String getD_pic() {
        return d_pic;
    }

    public void setD_pic(String d_pic) {
        this.d_pic = d_pic;
    }

    public String getD_pic2() {
        return d_pic2;
    }

    public void setD_pic2(String d_pic2) {
        this.d_pic2 = d_pic2;
    }

    public String getD_pic3() {
        return d_pic3;
    }

    public void setD_pic3(String d_pic3) {
        this.d_pic3 = d_pic3;
    }

    public String getD_created_by() {
        return d_created_by;
    }

    public void setD_created_by(String d_created_by) {
        this.d_created_by = d_created_by;
    }

    public String getD_created_time() {
        return new DateUtil().formatDateToString(d_created_time, DateUtil.DATE_FORMAT_YMDHMS_TIME);
    }

    public void setD_created_time(Date d_created_time) {
        this.d_created_time = d_created_time;
    }

    public String getD_updated_by() {
        return d_updated_by;
    }

    public void setD_updated_by(String d_updated_by) {
        this.d_updated_by = d_updated_by;
    }

    public String getD_updated_time() {
        return new DateUtil().formatDateToString(d_updated_time, DateUtil.DATE_FORMAT_YMDHMS_TIME);
    }

    public void setD_updated_time(Date d_updated_time) {
        this.d_updated_time = d_updated_time;
    }
}
