package com.neo.structure.bridge;

/**
 * @Author : neo
 * @Date 2021/3/25 12:20
 * @Description : 测试类
 */
public class Client {
    public static void main(String[] args) {
        Windows windows = new Windows(new AVIFile());
        Mac mac = new Mac(new RMVBFile());
        windows.play("战狼3");
        mac.play("唐伯虎点秋香");
    }
}
