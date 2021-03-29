package com.neo.behavor.strategy;

/**
 * @Author : neo
 * @Date 2021/3/27 10:38
 * @Description : 具体策略类：每个节日具体的促销活动
 */
public class StrategyB implements Strategy {


    public void show() {
        System.out.println("满200减50");
    }
}
