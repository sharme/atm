package com.atongmu.mvc.service.Impl;

import com.atongmu.mvc.dao.CompanyMapper;
import com.atongmu.mvc.dao.UserMapper;
import com.atongmu.mvc.model.Company;
import com.atongmu.mvc.model.User;
import com.atongmu.mvc.service.CompanyService;
import com.atongmu.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yao on 6/26/17.
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }
}
