package com.neo.structure.facade;

/**
 * @Author : neo
 * @Date 2021/3/25 17:03
 * @Description : 电视类（子系统角色）：实现系统的部分功能，客户可以通过外观角色访问它
 */
public class TV {
    //开电视
    public void on() {
        System.out.println("打开电视...");
    }

    //关电视
    public void off() {
        System.out.println("关闭电视...");
    }
}
