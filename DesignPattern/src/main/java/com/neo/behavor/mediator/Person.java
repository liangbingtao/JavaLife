package com.neo.behavor.mediator;


/**
 * @Author : neo
 * @Date 2021/3/28 15:19
 * @Description : 抽象同事类角色
 */
public abstract class Person {

    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
