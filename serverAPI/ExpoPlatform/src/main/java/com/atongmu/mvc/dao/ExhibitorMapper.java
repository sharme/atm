package com.atongmu.mvc.dao;

import com.atongmu.mvc.model.Exhibitor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 6/26/17.
 */
@Repository
public interface ExhibitorMapper {

    public List<Exhibitor> getExhibitors(@Param(value = "start") int start, @Param(value = "count") int count, @Param(value = "type") String type, @Param(value = "city") String city);

    public int getExhibitorNumber();

    public Exhibitor getExhibitorById(int id);

    public Exhibitor getExhibitorByUId(int u_id);


}
