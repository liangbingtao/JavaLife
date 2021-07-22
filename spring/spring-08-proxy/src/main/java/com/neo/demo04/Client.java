package com.neo.demo04;

import com.neo.demo02.UserService;
import com.neo.demo02.UserServiceImpl;

/**
 * @Description Author neo
 * Date 2021/3/4 22:11
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();

        //代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //设置要代理的对象
        pih.setTarget(userService);
        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.delete();
    }
}
