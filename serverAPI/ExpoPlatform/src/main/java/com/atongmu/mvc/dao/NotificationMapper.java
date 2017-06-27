package com.atongmu.mvc.dao;

import com.atongmu.mvc.model.Event;
import com.atongmu.mvc.model.Notification;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 6/25/17.
 */

@Repository
public interface NotificationMapper {

    public List<Notification> getNotificationsByUId(int u_id);

}
