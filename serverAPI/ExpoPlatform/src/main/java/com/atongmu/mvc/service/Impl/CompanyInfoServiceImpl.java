package com.atongmu.mvc.service.Impl;

import com.atongmu.mvc.dao.CompanyInfoMapper;
import com.atongmu.mvc.model.CompanyInfo;
import com.atongmu.mvc.service.CompanyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lzy on 17/6/1.
 */
@Service("companyInfoServiceImpl")
public class CompanyInfoServiceImpl implements CompanyInfoService{

    @Autowired
    CompanyInfoMapper infoMapper;

    public List<CompanyInfo> selectInfos() {
        return infoMapper.selectInfo();
    }
}
