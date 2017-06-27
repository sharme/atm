package com.atongmu.mvc.service.Impl;

import com.atongmu.mvc.dao.FeedbackMapper;
import com.atongmu.mvc.model.Feedback;
import com.atongmu.mvc.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yao on 6/28/17.
 */
@Service("feedbackServiceImpl")
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    FeedbackMapper feedbackMapper;

    @Override
    public List<Feedback> getAllFeedback() {
        return feedbackMapper.getAllFeedback();
    }

    @Override
    public int addFeedback(Feedback feedback) {
        return feedbackMapper.addFeedback(feedback);
    }
}
