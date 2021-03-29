package com.neo.behavor.visitor;

/**
 * @Author : neo
 * @Date 2021/3/29 9:18
 * @Description : 给宠物喂食的人（抽象访问者角色）
 */
public interface Person {

    void feed(Cat cat);

    void feed(Dog dog);
}
