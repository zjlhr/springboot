package com.lhr.server.dao;

import com.lhr.server.entity.Role;

public interface RoleMapper {
    int insert(Role record);

    int insertSelective(Role record);
}