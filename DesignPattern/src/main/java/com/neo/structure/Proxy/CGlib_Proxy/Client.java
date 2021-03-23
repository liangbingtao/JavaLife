package com.neo.structure.Proxy.CGlib_Proxy;

/**
 * @Author : neo
 * @Date 2021/3/23 17:28
 * @Description : TODO
 */
public class Client {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}
