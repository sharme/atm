package com.atongmu.mvc.service;

import com.atongmu.mvc.model.Company;
import com.atongmu.mvc.model.Designer;

import java.util.List;

/**
 * Created by yao on 6/26/17.
 */
public interface CompanyService {

    public List<Company> getCompanies(int start, int count, String type, String city);

    public int getCompanyNumber();

    public Company getCompanyById(int id);

    public Company getCompanyByUId(int u_id);

}
