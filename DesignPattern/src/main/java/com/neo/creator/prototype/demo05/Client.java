package com.neo.creator.prototype.demo05;

import java.sql.SQLData;

/**
 * @Author : neo
 * @Date 2021/3/29 15:37
 * @Description : TODO
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student();
        s1.setAge(20);
        s1.setName("张三");
        Teacher teacher1 = new Teacher();
        teacher1.setName("小明老师");
        teacher1.setStudent(s1);

        Teacher teacher2 = (Teacher) teacher1.clone();
        teacher2.setName("小赵老师");
        Student s2 = teacher2.getStudent();
        s2.setName("李四");
        s2.setAge(21);
        teacher2.setStudent(s2);
        System.out.println("teacher1：" + teacher1);
        System.out.println("teacher2：" + teacher2);
    }
}
