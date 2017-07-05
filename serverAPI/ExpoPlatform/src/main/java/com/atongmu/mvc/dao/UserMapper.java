package com.atongmu.mvc.dao;

import com.atongmu.mvc.model.Company;
import com.atongmu.mvc.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 6/26/17.
 */
@Repository
public interface UserMapper {

    public User getUserById(int id);

    public int updateUserById(User user);


}
