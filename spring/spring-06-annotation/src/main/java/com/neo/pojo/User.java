package com.neo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Description Author neo
 * Date 2021/1/25 13:20
 */

//Component组件
//等价于<bean id="user" class="com.neo.pojo.User"/>

@Component
@Scope("singleton")
public class User {

    //相当于<property name="name" value="梁兵涛"/>
    @Value("梁兵涛")
    public String name;
}
