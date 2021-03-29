package com.neo.structure.facade;

/**
 * @Author : neo
 * @Date 2021/3/25 17:03
 * @Description : 空调类（子系统角色）：实现系统的部分功能，客户可以通过外观角色访问它
 */
public class AirCondition {
    //开空调
    public void on(){
        System.out.println("打开空调...");
    }

    //关空调
    public void off(){
        System.out.println("关闭空调...");
    }
}
