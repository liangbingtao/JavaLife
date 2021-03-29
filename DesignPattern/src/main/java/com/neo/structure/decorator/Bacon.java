package com.neo.structure.decorator;

/**
 * @Author : neo
 * @Date 2021/3/24 19:54
 * @Description : 培根（具体装饰者角色）
 */
public class Bacon extends Garnish {


    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
    }

    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
