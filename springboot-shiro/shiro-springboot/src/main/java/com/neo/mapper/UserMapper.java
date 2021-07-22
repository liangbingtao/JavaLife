package com.neo.mapper;

import com.neo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author : neo
 * @Date 2021/7/22 16:31
 * @Description : TODO
 */
@Mapper
public interface UserMapper {
    public User queryUserByName(String name);
}
