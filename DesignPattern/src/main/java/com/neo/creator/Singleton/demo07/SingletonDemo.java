package com.neo.creator.Singleton.demo07;

/**
 * @Description Author neo
 * Date 2021/3/17 15:03
 */
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}
