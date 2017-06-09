package com.atongmu.mvc.service;

import com.atongmu.mvc.model.CompanyHistory;
import java.util.List;

/**
 * Created by yao on 6/10/17.
 */
public interface CompanyHistoryService {

    public List<CompanyHistory> getHistories();

    public boolean insertHistory(CompanyHistory companyHistory);

}
