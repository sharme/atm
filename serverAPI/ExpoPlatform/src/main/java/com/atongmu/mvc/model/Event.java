package com.atongmu.mvc.model;

import com.atongmu.mvc.util.DateUtil;

import javax.xml.soap.Text;
import java.awt.*;
import java.util.Date;

/**
 * Created by yao on 6/25/17.
 */
public class Event {

    private int e_id;
    private int u_id;
    private String e_logo;
    private String e_name;
    private String e_type;
    private String e_sponsors;
    private String e_co_sponsors;
    private String e_country;
    private String e_province;
    private String e_city;
    private String e_address;
    private Date e_start_date;
    private Date e_end_date;
    private String e_description;
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

    public String getE_logo() {
        return e_logo;
    }

    public void setE_logo(String e_logo) {
        this.e_logo = e_logo;
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

    public String getE_sponsors() {
        return e_sponsors;
    }

    public void setE_sponsors(String e_sponsors) {
        this.e_sponsors = e_sponsors;
    }

    public String getE_co_sponsors() {
        return e_co_sponsors;
    }

    public void setE_co_sponsors(String e_co_sponsors) {
        this.e_co_sponsors = e_co_sponsors;
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

    public String getE_address() {
        return e_address;
    }

    public void setE_address(String e_address) {
        this.e_address = e_address;
    }

    public String getE_start_date() {
        return new DateUtil().formatDateToString(e_start_date, DateUtil.DATE_FORMAT_YMDHMS_TIME);
    }

    public void setE_start_date(Date e_start_date) {
        this.e_start_date = e_start_date;
    }

    public String getE_end_date() {
        return new DateUtil().formatDateToString(e_end_date, DateUtil.DATE_FORMAT_YMDHMS_TIME);
    }

    public void setE_end_date(Date e_end_date) {
        this.e_end_date = e_end_date;
    }

    public String getE_description() {
        return e_description;
    }

    public void setE_description(String e_description) {
        this.e_description = e_description;
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
