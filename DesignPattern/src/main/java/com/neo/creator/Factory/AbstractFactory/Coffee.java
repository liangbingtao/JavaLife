package com.neo.creator.Factory.AbstractFactory;

/**
 * @Description Author neo
 * Date 2021/3/19 17:20
 */
public abstract class Coffee {
    public abstract String  getName();

    //加糖
    public void addSugar(){
        System.out.println("加糖");
    }

    //加奶
    public void addMilk(){
        System.out.println("加奶");
    }

}
