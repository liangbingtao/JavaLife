package com.neo.behavor.observer;

/**
 * @Author : neo
 * @Date 2021/3/28 13:03
 * @Description : 抽象观察者
 */
public interface Observer {

    //定义观察者角色中的更新方法
    void update(String message);
}
