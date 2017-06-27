package com.atongmu.mvc.dao;

import com.atongmu.mvc.model.Role;
import com.atongmu.mvc.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 6/26/17.
 */
@Repository
public interface RoleMapper {

    public List<Role> getRoles();


}
