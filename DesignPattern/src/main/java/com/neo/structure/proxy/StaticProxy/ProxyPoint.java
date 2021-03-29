package com.neo.structure.proxy.StaticProxy;

/**
 * @Author : neo
 * @Date 2021/3/23 16:46
 * @Description : 代理类
 */
public class ProxyPoint implements SellTickets {

    private TrainStation station = new TrainStation();

    public void sell() {
        System.out.println("代理点收取服务费");
        station.sell();
    }
}
