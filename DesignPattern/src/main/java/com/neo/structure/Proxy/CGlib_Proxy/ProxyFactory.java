package com.neo.structure.Proxy.CGlib_Proxy;

import com.sun.org.apache.xpath.internal.Arg;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author : neo
 * @Date 2021/3/23 17:22
 * @Description : TODO
 */
public class ProxyFactory implements MethodInterceptor {

    private TrainStation target=new TrainStation();

    public TrainStation getProxyObject(){
        //创建Enhancer对象，类似于JDK动态代理的Proxy类，下一步就是设置几个参数
        Enhancer enhancer=new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(target.getClass());
        //设置回调函数,当通过代理对象调用sell方法时,执行的是哪一个方法呢？
        // setCallback方法需要传递一个对象，该对象是MethodInterceptor子实现类对象，重写intercept方法
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation obj = (TrainStation) enhancer.create();
        return obj;
    }


    /*
      intercept方法参数说明：
          o ： 代理对象
          method ： 真实对象中的方法的Method实例
          args ： 实际参数
          methodProxy ：代理对象中的方法的method实例
   */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("代售点收取服务费");
        //调用目标对象的方法
        TrainStation result = (TrainStation) method.invoke(target,objects);

        return result;
    }
}
