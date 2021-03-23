package com.neo.creator.prototype.demo03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Description Author neo
 * Date 2021/3/20 16:00
 */
public class PrototypeTest {
    public static void main(String[] args) throws Exception {

        //创建原型对象
        Citation citation = new Citation();
        Student stu = new Student();
        stu.setName("张三");
        citation.setStudent(stu);

        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:\\a.txt"));
        //将citation对象写出到文件中
        oos.writeObject(citation);
        oos.close();

        //创建对象出入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:\\a.txt"));
        //读取对象
        Citation citation1 = (Citation) ois.readObject();
        //获取citation1奖状所属学生对象
        Student stu1 = citation1.getStudent();
        stu1.setName("李四");

        //判断stu对象和stu1对象是否是同一个对象
        System.out.println("stu和stu1是同一个对象？" + (stu == stu1));

        citation.show();
        citation1.show();


    }
}
