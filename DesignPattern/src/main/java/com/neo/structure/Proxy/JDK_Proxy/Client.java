package com.neo.structure.Proxy.JDK_Proxy;

/**
 * @Author : neo
 * @Date 2021/3/23 17:01
 * @Description : TODO
 */
public class Client {
    public static void main(String[] args) {
        //获取代理对象
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}
