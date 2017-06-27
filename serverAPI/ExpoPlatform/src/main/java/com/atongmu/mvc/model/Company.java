package com.atongmu.mvc.model;

import com.atongmu.mvc.util.DateUtil;

import java.util.Date;

/**
 * Created by yao on 6/27/17.
 */
public class Company {

    private int c_id;
    private int u_id;
    private String c_name;
    private String c_type;
    private String c_address;
    private String c_country;
    private String c_province;
    private String c_city;
    private int c_people;
    private String c_desc;
    private String c_logo;
    private String c_mobile_phone;
    private String c_qq;
    private String c_owner;
    private String c_phone;
    private String c_website;
    private int c_limit;
    private String c_pic;
    private String c_pic2;
    private String c_pic3;
    private String c_created_by;
    private Date c_created_time;
    private String c_updated_by;
    private Date c_updated_time;

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_type() {
        return c_type;
    }

    public void setC_type(String c_type) {
        this.c_type = c_type;
    }

    public String getC_address() {
        return c_address;
    }

    public void setC_address(String c_address) {
        this.c_address = c_address;
    }

    public String getC_country() {
        return c_country;
    }

    public void setC_country(String c_country) {
        this.c_country = c_country;
    }

    public String getC_province() {
        return c_province;
    }

    public void setC_province(String c_province) {
        this.c_province = c_province;
    }

    public String getC_city() {
        return c_city;
    }

    public void setC_city(String c_city) {
        this.c_city = c_city;
    }

    public int getC_people() {
        return c_people;
    }

    public void setC_people(int c_people) {
        this.c_people = c_people;
    }

    public String getC_desc() {
        return c_desc;
    }

    public void setC_desc(String c_desc) {
        this.c_desc = c_desc;
    }

    public String getC_logo() {
        return c_logo;
    }

    public void setC_logo(String c_logo) {
        this.c_logo = c_logo;
    }

    public String getC_mobile_phone() {
        return c_mobile_phone;
    }

    public void setC_mobile_phone(String c_mobile_phone) {
        this.c_mobile_phone = c_mobile_phone;
    }

    public String getC_qq() {
        return c_qq;
    }

    public void setC_qq(String c_qq) {
        this.c_qq = c_qq;
    }

    public String getC_owner() {
        return c_owner;
    }

    public void setC_owner(String c_owner) {
        this.c_owner = c_owner;
    }

    public String getC_phone() {
        return c_phone;
    }

    public void setC_phone(String c_phone) {
        this.c_phone = c_phone;
    }

    public String getC_website() {
        return c_website;
    }

    public void setC_website(String c_website) {
        this.c_website = c_website;
    }

    public int getC_limit() {
        return c_limit;
    }

    public void setC_limit(int c_limit) {
        this.c_limit = c_limit;
    }

    public String getC_pic() {
        return c_pic;
    }

    public void setC_pic(String c_pic) {
        this.c_pic = c_pic;
    }

    public String getC_pic2() {
        return c_pic2;
    }

    public void setC_pic2(String c_pic2) {
        this.c_pic2 = c_pic2;
    }

    public String getC_pic3() {
        return c_pic3;
    }

    public void setC_pic3(String c_pic3) {
        this.c_pic3 = c_pic3;
    }

    public String getC_created_by() {
        return c_created_by;
    }

    public void setC_created_by(String c_created_by) {
        this.c_created_by = c_created_by;
    }

    public String getC_created_time() {
        return new DateUtil().formatDateToString(c_created_time, DateUtil.DATE_FORMAT_YMDHMS_TIME);
    }

    public void setC_created_time(Date c_created_time) {
        this.c_created_time = c_created_time;
    }

    public String getC_updated_by() {
        return c_updated_by;
    }

    public void setC_updated_by(String c_updated_by) {
        this.c_updated_by = c_updated_by;
    }

    public String getC_updated_time() {
        return new DateUtil().formatDateToString(c_updated_time, DateUtil.DATE_FORMAT_YMDHMS_TIME);
    }

    public void setC_updated_time(Date c_updated_time) {
        this.c_updated_time = c_updated_time;
    }
}
