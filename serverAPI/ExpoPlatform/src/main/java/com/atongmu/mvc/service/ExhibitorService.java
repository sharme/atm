package com.atongmu.mvc.service;

import com.atongmu.mvc.model.Exhibitor;

import java.util.List;

/**
 * Created by yao on 6/26/17.
 */
public interface ExhibitorService {

    public List<Exhibitor> getExhibitors(int count, String type, String city);

    public Exhibitor getExhibitorById(int id);

}
