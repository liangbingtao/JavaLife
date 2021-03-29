package com.neo.structure.facade;

/**
 * @Author : neo
 * @Date 2021/3/25 17:12
 * @Description : 测试类
 */
public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        facade.say("打开家电");
        System.out.println("======================");
        facade.say("关闭家电");

    }
}
