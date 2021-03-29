package com.neo.structure.decorator;

/**
 * @Author : neo
 * @Date 2021/3/24 19:51
 * @Description : 装饰者类（抽象装饰者角色）
 */
public abstract class Garnish extends FastFood {

    //声明快餐变量，聚合
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }

}
