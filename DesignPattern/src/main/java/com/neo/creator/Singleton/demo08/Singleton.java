package com.neo.creator.Singleton.demo08;

/**
 * @Description Author neo
 * Date 2021/3/17 15:05
 *
 * 枚举类实现单例模式(属于饿汉模式)
 * 这是极力推荐的单例实现模式，因为枚举类型是线程安全的，并且只会装载一次
 * 枚举类型是所有单例实现中唯一一种不会被破坏的单例实现模式
 */


public enum Singleton {
    INSTANCE;

}
