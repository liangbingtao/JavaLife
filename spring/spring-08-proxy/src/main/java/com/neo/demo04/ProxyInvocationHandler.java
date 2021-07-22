package com.neo.demo04;

import com.neo.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description Author neo
 * Date 2021/3/4 21:39
 */

//等会我们会用这个类，自动生成代理类
//InvocationHandler：调用处理程序
//InvocationHandler:每个代理示例都有一个关联的调用处理程序，当在代理示例上调用方法时，方法调用将被编码
//并分派到其调用处理程序的invoke方法
public class ProxyInvocationHandler implements InvocationHandler {


    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }


    //生成得到代理类,固定代码
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        log(method.getName());
        //动态代理的本质，就是使用反射机制实现
        Object result = method.invoke(target, args);

        return result;
    }


    public void log(String msg) {
        System.out.println("执行了" + msg + "方法");
    }
}
