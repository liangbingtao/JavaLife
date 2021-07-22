package com.neo.behavor.command;

/**
 * @Author : neo
 * @Date 2021/3/27 15:52
 * @Description : 测试类
 */
public class Client {
    public static void main(String[] args) {
        //创建两个order
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFoodDic("西红柿鸡蛋面", 1);
        order1.setFoodDic("可口可乐", 2);

        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFoodDic("青椒肉丝", 1);
        order2.setFoodDic("雪碧", 1);

        //创建接收者
        SeniorChef chef = new SeniorChef();
        //将订单和接收者封装成命令对象
        OrderCommand cmd1 = new OrderCommand(chef, order1);
        OrderCommand cmd2 = new OrderCommand(chef, order2);

        //创建调用者waiter
        Waiter waiter = new Waiter();
        waiter.setCommands(cmd1);
        waiter.setCommands(cmd2);

        //将订单带到柜台，并向厨师喊 订单来了
        waiter.orderUp();

    }

}
