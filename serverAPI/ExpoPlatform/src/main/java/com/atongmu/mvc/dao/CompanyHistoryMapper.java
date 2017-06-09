package com.atongmu.mvc.dao;

import com.atongmu.mvc.model.CompanyHistory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 6/10/17.
 */

@Repository
public interface CompanyHistoryMapper {

    public List<CompanyHistory> getHistories();

    public boolean insertHistory(CompanyHistory companyHistory);

}
