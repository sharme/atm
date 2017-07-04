package com.atongmu.mvc.service.Impl;

import com.atongmu.mvc.dao.ExhibitorMapper;
import com.atongmu.mvc.model.Exhibitor;
import com.atongmu.mvc.service.ExhibitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yao on 6/26/17.
 */
@Service("exhibitorServiceImpl")
public class ExhibitorServiceImpl implements ExhibitorService {

    @Autowired
    ExhibitorMapper exhibitorMapper;

    @Override
    public List<Exhibitor> getExhibitors(int start, int count, String type, String city) {
        return exhibitorMapper.getExhibitors(start, count, type, city);
    }

    @Override
    public int getExhibitorNumber() {
        return exhibitorMapper.getExhibitorNumber();
    }

    @Override
    public Exhibitor getExhibitorById(int id) {
        return exhibitorMapper.getExhibitorById(id);
    }

    @Override
    public Exhibitor getExhibitorByUId(int u_id) {
        return exhibitorMapper.getExhibitorByUId(u_id);
    }



}
