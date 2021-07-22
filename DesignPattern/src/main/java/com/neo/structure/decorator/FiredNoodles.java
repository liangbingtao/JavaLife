package com.neo.structure.decorator;

/**
 * @Author : neo
 * @Date 2021/3/24 19:48
 * @Description : 炒面（具体构件角色）
 */
public class FiredNoodles extends FastFood {

    public FiredNoodles() {
        super(12, "炒面");
    }

    public float cost() {
        return getPrice();
    }
}
