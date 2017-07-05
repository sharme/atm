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

    public int insertUser(User user);

    public User login(@Param( value = "u_phone_num") String u_phone_num, @Param( value = "u_name") String u_name, @Param( value = "u_email") String u_email, @Param(value = "u_pwd") String u_pwd);


}
