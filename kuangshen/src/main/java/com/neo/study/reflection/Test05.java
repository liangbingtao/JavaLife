package com.neo.study.reflection;

import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @Description Author neo
 * Date 2020/11/24 16:24
 */
public class Test05 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);

        /*
        1.加载到内存，会产生一个类对应的Class对象
        2.链接，链接结束后m=0
        3.初始化
        <clinit>(){
        System.out.println("A类静态代码块初始化");
        m=300;
        m = 100;
        }
        m = 100;
         */
    }
}

class A {

    static{
        System.out.println("A类静态代码块初始化");
        m=300;
    }


    static int m = 100;

    public A() {
        System.out.println("A类的无参构造器初始化");
    }
}
