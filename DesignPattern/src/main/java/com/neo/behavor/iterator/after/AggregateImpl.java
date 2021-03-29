package com.neo.behavor.iterator.after;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : neo
 * @Date 2021/3/28 16:23
 * @Description : 具体聚合角色：实现抽象聚合类，返回一个具体迭代器实例
 */
public class AggregateImpl<T> implements Aggregate<T> {

    //学生列表
    private List<T> list = new ArrayList<T>();

    public void add(T item) {
        list.add(item);
    }

    public void remove(T item) {
        list.remove(item);
    }

    public Iterator getIterator() {
        return new IteratorImpl(list);
    }
}
