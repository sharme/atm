package com.atongmu.mvc.model;

import com.atongmu.mvc.util.DateUtil;

import java.util.Date;

/**
 * Created by yao on 6/26/17.
 */
public class Exhibitor {

    private int e_id;
    private int u_id;
    private String e_name;
    private String e_type;
    private String e_desc;
    private int e_people;
    private String e_logo;
    private String e_mobile_phone;
    private String  e_qq;
    private String e_phone;
    private String e_owner;
    private String e_website;
    private String e_address;
    private String e_country;
    private String e_province;
    private String e_city;
    private String e_created_by;
    private Date e_created_time;
    private String e_updated_by;
    private Date e_updated_time;

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public String getE_type() {
        return e_type;
    }

    public void setE_type(String e_type) {
        this.e_type = e_type;
    }

    public String getE_desc() {
        return e_desc;
    }

    public void setE_desc(String e_desc) {
        this.e_desc = e_desc;
    }

    public int getE_people() {
        return e_people;
    }

    public void setE_people(int e_people) {
        this.e_people = e_people;
    }

    public String getE_logo() {
        return e_logo;
    }

    public void setE_logo(String e_logo) {
        this.e_logo = e_logo;
    }

    public String getE_mobile_phone() {
        return e_mobile_phone;
    }

    public void setE_mobile_phone(String e_mobile_phone) {
        this.e_mobile_phone = e_mobile_phone;
    }

    public String getE_qq() {
        return e_qq;
    }

    public void setE_qq(String e_qq) {
        this.e_qq = e_qq;
    }

    public String getE_phone() {
        return e_phone;
    }

    public void setE_phone(String e_phone) {
        this.e_phone = e_phone;
    }

    public String getE_owner() {
        return e_owner;
    }

    public void setE_owner(String e_owner) {
        this.e_owner = e_owner;
    }

    public String getE_website() {
        return e_website;
    }

    public void setE_website(String e_website) {
        this.e_website = e_website;
    }

    public String getE_address() {
        return e_address;
    }

    public void setE_address(String e_address) {
        this.e_address = e_address;
    }

    public String getE_country() {
        return e_country;
    }

    public void setE_country(String e_country) {
        this.e_country = e_country;
    }

    public String getE_province() {
        return e_province;
    }

    public void setE_province(String e_province) {
        this.e_province = e_province;
    }

    public String getE_city() {
        return e_city;
    }

    public void setE_city(String e_city) {
        this.e_city = e_city;
    }

    public String getE_created_by() {
        return e_created_by;
    }

    public void setE_created_by(String e_created_by) {
        this.e_created_by = e_created_by;
    }

    public String getE_created_time() {
        return new DateUtil().formatDateToString(e_created_time, DateUtil.DATE_FORMAT_YMDHMS_TIME);
    }

    public void setE_created_time(Date e_created_time) {
        this.e_created_time = e_created_time;
    }

    public String getE_updated_by() {
        return e_updated_by;
    }

    public void setE_updated_by(String e_updated_by) {
        this.e_updated_by = e_updated_by;
    }

    public String getE_updated_time() {
        return new DateUtil().formatDateToString(e_updated_time, DateUtil.DATE_FORMAT_YMDHMS_TIME);
    }

    public void setE_updated_time(Date e_updated_time) {
        this.e_updated_time = e_updated_time;
    }
}
