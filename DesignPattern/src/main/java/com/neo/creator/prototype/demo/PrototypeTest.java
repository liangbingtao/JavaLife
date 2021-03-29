package com.neo.creator.prototype.demo;

/**
 * @Author : neo
 * @Date 2021/3/29 15:14
 * @Description : TODO
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建一个原型类对象
        Realizetype r1 = new Realizetype();
        //调用r1类中的clone方法进行克隆
        Realizetype r2 = r1.clone();

        System.out.println("对象r1和r2是同一个对象？" + (r1 == r2));
    }
}
