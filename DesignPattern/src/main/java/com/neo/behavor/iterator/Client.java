package com.neo.behavor.iterator;

import jdk.internal.org.objectweb.asm.tree.analysis.SourceValue;

/**
 * @Author : neo
 * @Date 2021/3/28 16:29
 * @Description : 测试类
 */
public class Client {
    public static void main(String[] args) {
        //创建聚合对象
        StudentAggregateImpl studentAggregate = new StudentAggregateImpl();
        //添加元素
        studentAggregate.addStudent(new Student("张三", "001"));
        studentAggregate.addStudent(new Student("李四", "002"));
        studentAggregate.addStudent(new Student("王五", "003"));
        studentAggregate.addStudent(new Student("赵六", "004"));

        //1、获取迭代器对象
        StudentIterator iterator = studentAggregate.getStudentIterator();
        //2、遍历
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.toString());
        }

    }
}
