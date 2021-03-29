package com.neo.behavor.strategy;

import java.util.Stack;

/**
 * @Author : neo
 * @Date 2021/3/27 10:42
 * @Description : 环境角色：用于连接上下文，这里可以理解为销售员
 */
public class SaleMan {
    //持有抽象策略角色的引用
    private Strategy strategy;

    public SaleMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    //向客户展示促销活动
    public void salesManShow() {
        strategy.show();
    }
}
