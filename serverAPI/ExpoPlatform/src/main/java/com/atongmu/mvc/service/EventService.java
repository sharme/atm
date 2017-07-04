package com.atongmu.mvc.service;

import com.atongmu.mvc.model.Event;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by yao on 6/25/17.
 */
public interface EventService {

    public List<Event> getEvents(int start, int count, String type, String city);

    public Event getEventById(int id);

    public int getEventNumber();

}
