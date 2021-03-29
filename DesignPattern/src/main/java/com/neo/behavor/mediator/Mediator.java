package com.neo.behavor.mediator;

/**
 * @Author : neo
 * @Date 2021/3/28 15:20
 * @Description : 抽象中介者角色
 */
public abstract class Mediator {

    public abstract void communicate(String message, Person person);
}
