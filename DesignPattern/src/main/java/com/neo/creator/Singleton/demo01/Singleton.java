package com.neo.creator.Singleton.demo01;

/**
 * @Description Author neo
 * Date 2021/3/17 14:29
 * 饿汉式——静态变量创建类的对象
 */
public class Singleton {
    //在静态位置创建该类的对象
    private static Singleton instance = new Singleton();

    //私有构造方法
    private Singleton() {
    }

    ;

    //对外提供静态方法获取该对象
    public static Singleton getInstance() {
        return instance;
    }


}
