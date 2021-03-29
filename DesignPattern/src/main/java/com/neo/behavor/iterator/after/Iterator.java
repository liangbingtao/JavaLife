package com.neo.behavor.iterator.after;

/**
 * @Author : neo
 * @Date 2021/3/28 16:16
 * @Description : 抽象迭代器角色,定义访问和遍历聚合元素的接口，通常包含hasNext()、next()方法。
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();
}
