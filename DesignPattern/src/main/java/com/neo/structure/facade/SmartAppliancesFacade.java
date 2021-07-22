package com.neo.structure.facade;

import java.nio.channels.NonWritableChannelException;

/**
 * @Author : neo
 * @Date 2021/3/25 17:07
 * @Description : 智能音响（外观角色）：维多个子系统提供一个共同的接口
 */
public class SmartAppliancesFacade {
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    //通过语音控制
    public void say(String msg) {
        if (msg.contains("打开")) {
            on();
        } else if (msg.contains("关闭")) {
            off();
        } else {
            System.out.println("我还听不懂你说的！！！");
        }
    }

    //起床后一键打开电器
    private void on() {
        System.out.println("起床了~");
        light.on();
        tv.on();
        airCondition.on();
    }

    //睡觉一键关闭电器
    private void off() {
        System.out.println("睡觉了~");
        light.off();
        tv.on();
        airCondition.off();
    }
}
