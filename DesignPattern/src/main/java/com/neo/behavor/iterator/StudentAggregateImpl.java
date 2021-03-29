package com.neo.behavor.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : neo
 * @Date 2021/3/28 16:23
 * @Description : 具体聚合角色：实现抽象聚合类，返回一个具体迭代器实例
 */
public class StudentAggregateImpl implements StudentAggregate {

    //学生列表
    private List<Student> list = new ArrayList<Student>();

    public void addStudent(Student student) {
        list.add(student);
    }

    public void removeStudent(Student student) {
        list.remove(student);
    }

    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
