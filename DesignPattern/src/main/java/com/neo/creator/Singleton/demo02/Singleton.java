package com.neo.creator.Singleton.demo02;

/**
 * @Description Author neo
 * Date 2021/3/17 14:35
 * <p>
 * 饿汉式——静态代码块方式
 */
public class Singleton {

    //只声明，不初始化
    private static Singleton instance;

    //私有构造方法
    private Singleton() {
    }

    ;

    //静态代码块实例化对象
    static {
        instance = new Singleton();
    }

    //对外提供获取该对象的方法
    public static Singleton getInstance() {
        return instance;
    }
}
