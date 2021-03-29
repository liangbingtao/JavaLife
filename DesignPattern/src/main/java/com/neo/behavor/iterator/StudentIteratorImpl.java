package com.neo.behavor.iterator;

import java.util.List;

/**
 * @Author : neo
 * @Date 2021/3/28 16:18
 * @Description : 具体迭代器角色：实现抽象迭代器中所定义的方法，完成对聚合对象的遍历，记录便利的当前位置
 */
public class StudentIteratorImpl implements StudentIterator {

    private List<Student> list;
    private int position = 0;


    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    public boolean hasNext() {
        return position < list.size();
    }

    public Student next() {
        Student currentStudent = list.get(position);
        position++;
        return currentStudent;
    }
}
