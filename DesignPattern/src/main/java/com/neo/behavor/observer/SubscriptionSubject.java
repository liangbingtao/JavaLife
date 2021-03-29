package com.neo.behavor.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : neo
 * @Date 2021/3/28 13:04
 * @Description : 微信公众号是具体主题类，里面存储了订阅该公众号的微信用户，并实现了抽象主题中的方法
 */
public class SubscriptionSubject implements Subject {

    //储存订阅公众号的微信用户
    private List<Observer> wechatUserlist = new ArrayList<Observer>();

    public void attach(Observer observer) {
        wechatUserlist.add(observer);
    }

    public void detach(Observer observer) {
        wechatUserlist.remove(observer);
    }

    public void notify(String message) {
        for (Observer observer : wechatUserlist) {
            observer.update(message);
        }
    }
}
