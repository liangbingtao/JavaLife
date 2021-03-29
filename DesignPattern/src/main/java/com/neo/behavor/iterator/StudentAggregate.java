package com.neo.behavor.iterator;

/**
 * @Author : neo
 * @Date 2021/3/28 16:21
 * @Description : 抽象聚合角色，定义存储，添加，删除聚合元素以及创建迭代器对象的接口
 */
public interface StudentAggregate {

    //添加学生
    void addStudent(Student student);

    //删除学生
    void removeStudent(Student student);

    //获得迭代器对象
    StudentIterator getStudentIterator();
}
