package com.atongmu.mvc.service;

import com.atongmu.mvc.model.Company;
import com.atongmu.mvc.model.User;

import java.util.List;

/**
 * Created by yao on 6/26/17.
 */
public interface UserService {

    public User getUserById(int id);

    public int updateUserById(User user);

    public int insertUser(User user);

    public User login(String u_phone_num, String u_name, String u_email, String u_pwd);

}
