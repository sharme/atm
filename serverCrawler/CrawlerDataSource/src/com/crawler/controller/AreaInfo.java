package com.crawler.controller;

import net.sf.json.JSONObject;

import java.io.Serializable;

/**
 * Created by lzy on 17/6/3.
 */
public class AreaInfo implements Serializable {
    private int id_address_area;
    private int id;
    private String level;

    private String name;
    private int parent_id;
    private String postcode;

    public int getId_address_area() {
        return id_address_area;
    }

    public void setId_address_area(int id_address_area) {
        this.id_address_area = id_address_area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public AreaInfo(JSONObject jsonObject){
        this.setId(jsonObject.getInt("id"));
        this.setLevel(jsonObject.getString("level"));
        this.setName(jsonObject.getString("name"));
        this.setParent_id(jsonObject.getInt("parent_id"));
        this.setPostcode(jsonObject.getString("postcode"));
    }
}
