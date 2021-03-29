package com.neo.creator.prototype.demo05;

import java.io.Serializable;

/**
 * @Author : neo
 * @Date 2021/3/29 15:23
 * @Description : TODO
 */
public class Student implements Cloneable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        return student;
    }
}
