package com.atongmu.mvc.service;

import com.atongmu.mvc.model.Exhibitor;

import java.util.List;

/**
 * Created by yao on 6/26/17.
 */
public interface ExhibitorService {

    public List<Exhibitor> getExhibitors(int start, int count, String type, String city);

    public int getExhibitorNumber();

    public Exhibitor getExhibitorById(int id);

    public Exhibitor getExhibitorByUId(int u_id);

}
