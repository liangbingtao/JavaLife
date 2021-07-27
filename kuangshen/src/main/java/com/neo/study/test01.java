package com.neo.study;

/**
 * @Author : neo
 * @Date 2021/7/26 11:20
 * @Description : TODO
 */

class Base {
    public void method() {
        System.out.println("Base");
    }
}

class Son extends Base {
    public void method() {
        System.out.println("Son");
    }

    public void methodB() {
        System.out.println("SonB");
    }
}

public class test01 {
    public static void main(String[] args) {
        Base base = new Son();
        base.method();

        //向下转型
        Son son = (Son) base;
        son.method();
        son.methodB();


        // base.methodB();
    }
}
