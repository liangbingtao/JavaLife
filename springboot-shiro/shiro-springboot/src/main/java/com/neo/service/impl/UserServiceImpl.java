package com.neo.service.impl;

import com.neo.mapper.UserMapper;
import com.neo.pojo.User;
import com.neo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author : neo
 * @Date 2021/7/22 16:40
 * @Description : TODO
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserByName(String name) {
        return userMapper.queryUserByName(name);
    }
}
