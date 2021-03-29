package com.neo.behavor.observer;

/**
 * @Author : neo
 * @Date 2021/3/28 13:02
 * @Description : 抽象主题类
 */
public interface Subject {

    //增加订阅者
    void attach(Observer observer);

    //删除订阅者
    void detach(Observer observer);

    //通知订阅者更新消息
    void notify(String message);
}
