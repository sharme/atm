package com.atongmu.mvc.service;

import com.atongmu.mvc.model.Feedback;
import com.atongmu.mvc.model.Notification;

import java.util.List;

/**
 * Created by yao on 6/25/17.
 */
public interface FeedbackService {

    public List<Feedback> getAllFeedback();

    public int addFeedback(Feedback feedback);


}
