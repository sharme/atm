package com.atongmu.mvc.service;

import com.atongmu.mvc.model.Newest;

import java.util.List;

/**
 * Created by yao on 6/22/17.
 */
public interface NewestService {

    public List<Newest> getNewest();

    public int insertNewest(Newest newest);

}
