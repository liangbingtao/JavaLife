package com.neo.mapper;

import com.neo.pojo.User;

import java.util.List;

/**
 * @Description Author neo
 * Date 2021/3/5 16:03
 */


public interface UserMapper {

    public List<User> selectUser();
}
