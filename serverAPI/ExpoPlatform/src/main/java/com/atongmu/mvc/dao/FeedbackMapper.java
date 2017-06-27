package com.atongmu.mvc.dao;

import com.atongmu.mvc.model.Feedback;
import com.atongmu.mvc.model.Notification;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 6/25/17.
 */

@Repository
public interface FeedbackMapper {

    public List<Feedback> getAllFeedback();

    public int addFeedback(Feedback feedback);

}
