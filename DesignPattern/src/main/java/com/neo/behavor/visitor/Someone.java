package com.neo.behavor.visitor;

/**
 * @Author : neo
 * @Date 2021/3/29 9:25
 * @Description : 具体访问者角色
 */
public class Someone implements Person {
    public void feed(Cat cat) {
        System.out.println("其他人喂食猫");
    }

    public void feed(Dog dog) {
        System.out.println("其他人喂食狗");
    }
}
