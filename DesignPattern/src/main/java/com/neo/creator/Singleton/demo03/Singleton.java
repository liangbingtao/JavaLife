package com.neo.creator.Singleton.demo03;

/**
 * @Description Author neo
 * Date 2021/3/17 14:40
 * 懒汉式——类在加载时，不会创建对象，只有在调用getInstance()方法时，才会创建对象
 * 线程不安全
 */
public class Singleton {

    private static Singleton instance;

    //私有构造方法
    private Singleton() {
    }

    ;

    //对外提供获取该对象的方法
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
