package com.neo.behavor.iterator.after;

import java.util.List;

/**
 * @Author : neo
 * @Date 2021/3/28 16:18
 * @Description : 具体迭代器角色：实现抽象迭代器中所定义的方法，完成对聚合对象的遍历，记录便利的当前位置
 */
public class IteratorImpl<T> implements Iterator<T> {

    private List<T> list;
    private int position = 0;


    public IteratorImpl(List<T> list) {
        this.list = list;
    }

    public boolean hasNext() {
        return position < list.size();
    }


    public T next() {
        T current = list.get(position);
        position++;
        return current;
    }
}
