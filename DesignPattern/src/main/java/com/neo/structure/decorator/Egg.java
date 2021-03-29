package com.neo.structure.decorator;

/**
 * @Author : neo
 * @Date 2021/3/24 19:54
 * @Description : 鸡蛋（具体装饰者角色）
 */
public class Egg extends Garnish {


    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
