package com.atongmu.mvc.service.Impl;

import com.atongmu.mvc.dao.CompanyHistoryMapper;
import com.atongmu.mvc.model.CompanyHistory;
import com.atongmu.mvc.service.CompanyHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yao on 6/10/17.
 */
@Service("companyHistoryServiceImpl")
public class CompanyHistoryServiceImpl implements CompanyHistoryService{

    @Autowired
    CompanyHistoryMapper companyHistoryMapper;

    public List<CompanyHistory> getHistories() {
        return companyHistoryMapper.getHistories();
    }

    public boolean insertHistory(CompanyHistory companyHistory) {
        return false;
    }
}
