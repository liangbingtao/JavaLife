package com.neo.behavor.mediator;

/**
 * @Author : neo
 * @Date 2021/3/28 15:27
 * @Description : 具体同事类角色
 */
public class Tenant extends Person {
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    //与中介者联系
    public void communicate(String message) {
        mediator.communicate(message, this);
    }

    //获取信息
    public void getMessage(String message) {
        System.out.println("租房者" + name + "获取到的信息： " + message);
    }
}
