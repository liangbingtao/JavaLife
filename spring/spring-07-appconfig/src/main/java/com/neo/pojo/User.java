package com.neo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description Author neo
 * Date 2021/1/25 15:11
 */

//这个注解的意思就是说明，这个类被Spring接管了，注册到了容器中
@Component
public class User {

    @Value("张三")    //属性注入值
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
