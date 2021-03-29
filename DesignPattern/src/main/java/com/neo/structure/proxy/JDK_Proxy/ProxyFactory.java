package com.neo.structure.proxy.JDK_Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author : neo
 * @Date 2021/3/23 16:51
 * @Description : 代理工厂，用来创建代理对象
 */
public class ProxyFactory {


    private TrainStation station = new TrainStation();

    public SellTickets getProxyObject() {
        //使用Proxy获取代理对象
        /*
            newProxyInstance()方法参数说明：
                ClassLoader loader ： 类加载器，用于加载代理类，使用真实对象的类加载器即可
                Class<?>[] interfaces ： 真实对象所实现的接口，代理模式真实对象和代理对象实现相同的接口
                InvocationHandler h ： 代理对象的调用处理程序
         */
        //代理类也实现了卖票接口，所以可以向上转型接收
        //newProxyInstance()方法返回的是Object类型，需要强制转换
        SellTickets proxyInstance = (SellTickets) Proxy.newProxyInstance(station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                //需要一个接口，这里我们创建其子实现类对象，重写invoke方法
                new InvocationHandler() {
                    /*
                                InvocationHandler中invoke方法参数说明：
                                    proxy ： 代理对象，在invoke方法中基本不用
                                    method ： 对应于在代理对象上调用的接口方法的 Method 实例
                                    args ： 代理对象调用接口方法时传递的实际参数
                             */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println("代售点收取服务费");
                        //执行真实对象
                        Object result = method.invoke(station, args);
                        return result;
                    }
                }
        );

        return proxyInstance;
    }
}
