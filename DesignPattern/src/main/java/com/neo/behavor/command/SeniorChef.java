package com.neo.behavor.command;

/**
 * @Author : neo
 * @Date 2021/3/27 15:34
 * @Description : 厨师类（实现者/接受者角色）
 */
public class SeniorChef {
    public void makeFood(int num, String foodName) {
        System.out.println(num + "份 " + foodName);
    }
}
