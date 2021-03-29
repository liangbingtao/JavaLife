package com.neo.behavor.mediator;

/**
 * @Author : neo
 * @Date 2021/3/28 15:23
 * @Description : 具体同事类角色
 */
public class HouseOwner extends Person {
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    //与终结者联系
    public void communicate(String message) {
        mediator.communicate(message, this);
    }

    //获取信息
    public void getMessage(String message) {
        System.out.println("房主" + name + "获取到的信息： " + message);
    }
}
