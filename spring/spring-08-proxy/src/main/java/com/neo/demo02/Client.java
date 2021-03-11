package com.neo.demo02;


/**
 * @Description Author neo
 * Date 2021/3/4 20:25
 */

//客户
public class Client {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        UserServiceProxy proxy = new UserServiceProxy();

        proxy.setUserService(userService);

        proxy.add();
    }
}
