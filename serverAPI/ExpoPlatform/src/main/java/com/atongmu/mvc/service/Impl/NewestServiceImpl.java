package com.atongmu.mvc.service.Impl;

import com.atongmu.mvc.dao.NewestMapper;
import com.atongmu.mvc.model.Newest;
import com.atongmu.mvc.service.NewestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yao on 6/22/17.
 */
@Service("newestServiceImpl")
public class NewestServiceImpl implements NewestService{

    @Autowired
    NewestMapper newestMapper;

    public List<Newest> getNewest(int count) {
        System.out.println("testing service: " + newestMapper.getNewest(count));
        return newestMapper.getNewest(count);
    }

    public int insertNewest(Newest newest) {
        return newestMapper.insertNewest(newest);
    }


}
