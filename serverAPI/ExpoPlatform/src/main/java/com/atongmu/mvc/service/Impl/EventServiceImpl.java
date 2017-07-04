package com.atongmu.mvc.service.Impl;

import com.atongmu.mvc.dao.EventMapper;
import com.atongmu.mvc.model.Event;
import com.atongmu.mvc.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yao on 6/25/17.
 */
@Service("eventServiceImpl")
public class EventServiceImpl implements EventService{

    @Autowired
    EventMapper eventMapper;


    @Override
    public List<Event> getEvents(int start, int count, String type, String city) {
        return eventMapper.getEvents(start, count, type, city);
    }

    @Override
    public Event getEventById(int id) {
        return eventMapper.getEventById(id);
    }

    @Override
    public int getEventNumber() {
        return eventMapper.getEventNumber();
    }
}
