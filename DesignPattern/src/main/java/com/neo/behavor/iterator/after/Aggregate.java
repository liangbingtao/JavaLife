package com.neo.behavor.iterator.after;

/**
 * @Author : neo
 * @Date 2021/3/28 16:21
 * @Description : 抽象聚合角色，定义存储，添加，删除聚合元素以及创建迭代器对象的接口
 */
public interface Aggregate<T> {

    //添加元素
    void add(T item);

    //删除学生
    void remove(T item);

    //获得迭代器对象
    Iterator getIterator();
}
