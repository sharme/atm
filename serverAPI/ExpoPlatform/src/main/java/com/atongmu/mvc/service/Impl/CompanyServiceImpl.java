package com.atongmu.mvc.service.Impl;

import com.atongmu.mvc.dao.CompanyMapper;
import com.atongmu.mvc.dao.DesignerMapper;
import com.atongmu.mvc.model.Company;
import com.atongmu.mvc.model.Designer;
import com.atongmu.mvc.service.CompanyService;
import com.atongmu.mvc.service.DesignerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yao on 6/26/17.
 */
@Service("companyServiceImpl")
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyMapper companyMapper;

    @Override
    public List<Company> getCompanies(int start, int count, String type, String city) {
        return companyMapper.getCompanies(start, count, type, city);
    }

    @Override
    public int getCompanyNumber() {
        return companyMapper.getCompanyNumber();
    }

    @Override
    public Company getCompanyById(int id) {
        return companyMapper.getCompanyById(id);
    }

    @Override
    public Company getCompanyByUId(int u_id) {
        return companyMapper.getCompanyByUId(u_id);
    }


}
