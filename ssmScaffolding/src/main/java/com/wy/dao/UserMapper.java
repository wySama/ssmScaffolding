package com.wy.dao;

import com.wy.base.BaseMapper;
import com.wy.dto.User;

public interface UserMapper extends BaseMapper<User> {

    public abstract  User selectById( Integer id);
}
