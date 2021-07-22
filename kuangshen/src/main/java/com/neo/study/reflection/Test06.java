package com.neo.study.reflection;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @Description Author neo
 * Date 2020/11/24 16:51
 */
//测试类什么是哦后会初始化
public class Test06 {
    static {
        System.out.println("Main类被加载");
    }

    //由父及子，静态先行
    public static void main(String[] args) throws ClassNotFoundException {
        //1.主动引用
//        Son son = new Son();

        //2.反射也会产生主动引用
//        Class.forName("com.neo.study.reflection.Son");

        //不会产生类的引用的方法--子类 访问父类的静态变量不会导致子类被初始化
        System.out.println(Son.b);

        Son[] array = new Son[5];

        //引用常量不会导致对应的类被初始化，连接阶段就放入常量池中了
        System.out.println(Son.M);
    }
}

class Father {
    static int b = 2;

    static {
        System.out.println("父类被加载");
    }
}

class Son extends Father {
    static {
        System.out.println("子类被加载");
        m = 300;
    }

    static int m = 100;
    static final int M = 1;
}
