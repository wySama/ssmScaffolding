package com.wy.service;

import com.wy.base.BaseService;
import com.wy.dao.UserMapper;
import com.wy.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User> {
    @Autowired
    private UserMapper userMapper;

    public  User selectById( Integer id){
        return userMapper.selectById(id);
    }
}
