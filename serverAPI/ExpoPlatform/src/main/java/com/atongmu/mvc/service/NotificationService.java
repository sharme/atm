package com.atongmu.mvc.service;

import com.atongmu.mvc.model.Event;
import com.atongmu.mvc.model.Notification;

import java.util.List;

/**
 * Created by yao on 6/25/17.
 */
public interface NotificationService {

    public List<Notification> getNotificationsByUId(int u_id);

}
