package com.neo.creator.Singleton.demo05;

/**
 * @Description Author neo
 * Date 2021/3/17 14:49
 * 懒汉式方式三——双重检查锁，getInstance()方法，枷锁导致执行效率低下，而该方法大多数操作都是读操作，读操作是线程安全的
 * 依次我们没必要让每个线程都必须尺有所才能调用该方法，我们需要调整枷锁的时机
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    ;

    public static Singleton getInstance() {
        //第一次判断，如果instance不为null,不仅如此抢锁阶段，直接返回实例
        if (instance == null) {
            synchronized (Singleton.class) {
                //抢到所之后再次判断是否为null
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
