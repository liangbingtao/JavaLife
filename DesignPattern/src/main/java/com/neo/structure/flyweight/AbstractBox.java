package com.neo.structure.flyweight;

/**
 * @Author : neo
 * @Date 2021/3/26 15:16
 * @Description : 抽象方块类（抽象享元角色）
 */
public abstract class AbstractBox {

    //获得形状
    public abstract String getShape();

    //显示图形和颜色
    public void display(String color) {
        System.out.println("方块形状：" + this.getShape() + " , 颜色：" + color);
    }
}
