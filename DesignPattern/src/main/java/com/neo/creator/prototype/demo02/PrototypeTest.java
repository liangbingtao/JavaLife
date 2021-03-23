package com.neo.creator.prototype.demo02;

/**
 * @Description Author neo
 * Date 2021/3/20 16:00
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        //创建原型对象
        Citation citation = new Citation();
        Student stu = new Student();
        stu.setName("张三");
        citation.setStudent(stu);


        //克隆奖状对象
        Citation clone1 = citation.clone();
        Student stu1 = clone1.getStudent();
        stu1.setName("李四");

        citation.show();
        clone1.show();


    }
}
