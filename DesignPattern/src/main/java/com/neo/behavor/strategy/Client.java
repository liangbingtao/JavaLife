package com.neo.behavor.strategy;

/**
 * @Author : neo
 * @Date 2021/3/27 10:41
 * @Description : 测试类
 */
public class Client {
    public static void main(String[] args) {
        //春节促销活动
        SaleMan saleMan = new SaleMan(new StrategyA());
        saleMan.salesManShow();
        System.out.println("===================");

        //中秋节促销活动
        saleMan.setStrategy(new StrategyB());
        saleMan.salesManShow();
        System.out.println("==================");

        //圣诞节促销活动
        saleMan.setStrategy(new StrategyC());
        saleMan.salesManShow();
    }
}
