package com.atongmu.mvc.service.Impl;

import com.atongmu.mvc.dao.EventMapper;
import com.atongmu.mvc.dao.NotificationMapper;
import com.atongmu.mvc.model.Event;
import com.atongmu.mvc.model.Notification;
import com.atongmu.mvc.service.EventService;
import com.atongmu.mvc.service.NotificationService;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yao on 6/25/17.
 */
@Service("notificationServiceImpl")
public class NotificationServiceImpl implements NotificationService{

    @Autowired
    NotificationMapper notificationMapper;


    @Override
    public List<Notification> getNotificationsByUId(int u_id) {
        return notificationMapper.getNotificationsByUId(u_id);
    }
}
