package com.atongmu.mvc.service.Impl;

import com.atongmu.mvc.dao.RoleMapper;
import com.atongmu.mvc.dao.UserMapper;
import com.atongmu.mvc.model.Role;
import com.atongmu.mvc.model.User;
import com.atongmu.mvc.service.RoleService;
import com.atongmu.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yao on 6/26/17.
 */
@Service("roleServiceImpl")
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<Role> getRoles() {
        return roleMapper.getRoles();
    }
}
