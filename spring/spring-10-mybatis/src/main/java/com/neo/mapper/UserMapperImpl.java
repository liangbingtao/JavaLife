package com.neo.mapper;

import com.neo.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @Description Author neo
 * Date 2021/3/5 17:10
 */
public class UserMapperImpl implements UserMapper {

    //我们所有的操作，都是用sqlSession来执行，在原来，现在都使用SqlSessionTemplate;
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
