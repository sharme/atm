package com.atongmu.mvc.dao;

import com.atongmu.mvc.model.Newest;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 6/22/17.
 */
@Repository
public interface NewestMapper {

    public List<Newest> getNewest(int count);

    public int insertNewest(Newest newest);


}

