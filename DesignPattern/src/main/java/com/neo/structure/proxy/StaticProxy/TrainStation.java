package com.neo.structure.proxy.StaticProxy;

/**
 * @Description Author neo
 * @Date 2021/3/23 16:38
 * @Description: 真实目标
 */
public class TrainStation implements SellTickets {
    public void sell() {
        System.out.println("火车站售票");
    }
}
