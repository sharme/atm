package com.atongmu.mvc.dao;

import com.atongmu.mvc.model.Event;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 6/25/17.
 */

@Repository
public interface EventMapper {

    public List<Event> getEvents(@Param(value = "count") int count, @Param(value = "type") String type);

    public Event getEventById(int id);

}
