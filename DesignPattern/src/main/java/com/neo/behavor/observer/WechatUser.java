package com.neo.behavor.observer;

/**
 * @Author : neo
 * @Date 2021/3/28 13:10
 * @Description : 具体观察者角色
 */
public class WechatUser implements Observer {

    //微信用户名
    private String name;

    public WechatUser(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + "--" + message);
    }
}
