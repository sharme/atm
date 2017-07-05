package com.atongmu.mvc.model;

import com.atongmu.mvc.util.DateUtil;

import java.util.Date;

/**
 * Created by yao on 6/27/17.
 */
public class User {

    private int u_id;
    private String u_name;
    private String u_phone_num;
    private String u_email;
    private String u_pwd;

    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd;
    }

    private int u_status;
    private String u_avatar;
    private String u_desc;
    private String u_address;

    public String getU_address() {
        return u_address;
    }

    public void setU_address(String u_address) {
        this.u_address = u_address;
    }

    private int u_role;
    private String u_created_by;
    private Date u_created_time;
    private String u_updated_by;
    private Date u_updated_time;

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_phone_num() {
        return u_phone_num;
    }

    public void setU_phone_num(String u_phone_num) {
        this.u_phone_num = u_phone_num;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    public int getU_status() {
        return u_status;
    }

    public void setU_status(int u_status) {
        this.u_status = u_status;
    }

    public String getU_avatar() {
        return u_avatar;
    }

    public void setU_avatar(String u_avatar) {
        this.u_avatar = u_avatar;
    }

    public String getU_desc() {
        return u_desc;
    }

    public void setU_desc(String u_desc) {
        this.u_desc = u_desc;
    }

    public int getU_role() {
        return u_role;
    }

    public void setU_role(int u_role) {
        this.u_role = u_role;
    }

    public String getU_created_by() {
        return u_created_by;
    }

    public void setU_created_by(String u_created_by) {
        this.u_created_by = u_created_by;
    }

    public String getU_created_time() {
        return new DateUtil().formatDateToString(u_created_time, DateUtil.DATE_FORMAT_YMDHMS_TIME);
    }

    public void setU_created_time(Date u_created_time) {
        this.u_created_time = u_created_time;
    }

    public String getU_updated_by() {
        return u_updated_by;
    }

    public void setU_updated_by(String u_updated_by) {
        this.u_updated_by = u_updated_by;
    }

    public String getU_updated_time() {
        return new DateUtil().formatDateToString(u_updated_time, DateUtil.DATE_FORMAT_YMDHMS_TIME);
    }

    public void setU_updated_time(Date u_updated_time) {
        this.u_updated_time = u_updated_time;
    }
}
