package com.neo.structure.decorator;

import javax.sound.sampled.FloatControl;

/**
 * @Author : neo
 * @Date 2021/3/24 19:42
 * @Description : 快餐类——抽象构件角色
 */
public abstract class FastFood {

    //价格
    private float price;
    //描述
    private String desc;

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    //定义抽象方法——计算价格
    public abstract float cost();
}
