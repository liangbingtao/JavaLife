package com.neo.diy;

/**
 * @Description Author neo
 * Date 2021/3/5 13:35
 */
public class DiyPointCut {

    public void before(){
        System.out.println("===========方法执行前打印=================");
    }

    public void after(){
        System.out.println("===========方法执行后打印=================");
    }
}
