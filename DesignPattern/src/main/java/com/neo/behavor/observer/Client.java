package com.neo.behavor.observer;

/**
 * @Author : neo
 * @Date 2021/3/28 13:11
 * @Description : 测试类
 */
public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();

        //创建微信用户
        WechatUser user1 = new WechatUser("张三");
        WechatUser user2 = new WechatUser("李四");
        WechatUser user3 = new WechatUser("王五");

        //订阅公众号
        subscriptionSubject.attach(user1);
        subscriptionSubject.attach(user2);
        subscriptionSubject.attach(user3);

        //公众号更新发出通知给订阅的微信用户
        subscriptionSubject.notify("今天的Java知识更新了，请查收");
    }
}
