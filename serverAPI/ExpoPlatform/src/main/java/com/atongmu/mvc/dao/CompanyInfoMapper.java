package com.atongmu.mvc.dao;

import com.atongmu.mvc.model.CompanyInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lzy on 17/6/1.
 */
@Repository
public interface CompanyInfoMapper {
    public List<CompanyInfo> selectInfo();
}
