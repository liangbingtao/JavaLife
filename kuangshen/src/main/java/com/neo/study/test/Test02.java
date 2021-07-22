package com.neo.study.test;

import java.sql.SQLOutput;

/**
 * @Description Author neo
 * Date 2020/11/24 21:24
 */
//测试继承
public class Test02 {
    public static void main(String[] args) {
        Son son = new Son();
        son.call();

//        Father father = new Son();
//        father.call();
//        System.out.println(father.getName());

    }

}

class Father {
    private String name = "zhangsan";

    public void call() {
        System.out.println("父类的call方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Son extends Father {

    public void call() {
        System.out.println("子类的call方法");
        System.out.println(new Father().getName());
    }
}
