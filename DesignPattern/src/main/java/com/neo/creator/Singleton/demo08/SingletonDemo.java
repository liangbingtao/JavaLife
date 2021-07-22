package com.neo.creator.Singleton.demo08;

/**
 * @Description Author neo
 * Date 2021/3/17 15:07
 */
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;

        System.out.println(instance == instance1);
    }
}
