package com.atongmu.mvc.dao;

import com.atongmu.mvc.model.Company;
import com.atongmu.mvc.model.Designer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 6/26/17.
 */
@Repository
public interface CompanyMapper {

    public List<Company> getCompanies(@Param(value = "start") int start, @Param(value = "count") int count, @Param(value = "type") String type, @Param(value = "city") String city);

    public int getCompanyNumber();

    public Company getCompanyById(int id);

    public Company getCompanyByUId(int u_id);


}
