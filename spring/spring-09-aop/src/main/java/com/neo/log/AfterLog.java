package com.neo.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Description Author neo
 * Date 2021/3/5 11:26
 */
public class AfterLog implements AfterReturningAdvice {

    //returnValue:返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+method.getName()+"方法，返回结果为"+returnValue);

    }
}
