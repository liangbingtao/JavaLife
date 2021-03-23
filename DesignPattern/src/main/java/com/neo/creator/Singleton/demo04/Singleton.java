package com.neo.creator.Singleton.demo04;

/**
 * @Description Author neo
 * Date 2021/3/17 14:46
 * 懒汉式——方式二
 * 线程安全的00
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    ;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
