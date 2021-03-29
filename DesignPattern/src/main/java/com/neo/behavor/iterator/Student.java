package com.neo.behavor.iterator;

/**
 * @Author : neo
 * @Date 2021/3/28 16:15
 * @Description : 学生类
 */
public class Student {
    private String name;
    private String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }
}
