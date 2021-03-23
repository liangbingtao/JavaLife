package com.neo.creator.prototype.demo03;

import java.io.Serializable;

/**
 * @Description Author neo
 * Date 2021/3/20 15:57
 */
public class Student implements Serializable {

    //学生姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
