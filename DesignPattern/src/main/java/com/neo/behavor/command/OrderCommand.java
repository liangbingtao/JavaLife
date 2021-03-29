package com.neo.behavor.command;

import java.util.Map;

/**
 * @Author : neo
 * @Date 2021/3/27 15:37
 * @Description : 具体命令类,实现抽象命令接口，通常会持有接收者，并调用接收者的功能来完成命令要执行的操作。
 */
public class OrderCommand implements Command {

    //持有接收者
    private SeniorChef receiver;
    //持有订单类
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    //实现接口中的方法，调用接收者的功能完成要执行的操作
    public void execute() {
        System.out.println(order.getDiningTable() + "号桌的订单：");
        Map<String, Integer> foodDic = order.getFoodDic();
        for (String key : foodDic.keySet()) {
            receiver.makeFood(foodDic.get(key),key);
        }

        System.out.println(order.getDiningTable()+"号桌的饭做好了");
        System.out.println("==========================");
    }
}
