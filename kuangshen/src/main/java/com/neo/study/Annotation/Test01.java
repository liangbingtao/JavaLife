package com.neo.study.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description Author neo
 * Date 2020/11/24 14:39
 */
//自定义注解
public class Test01 {
    //注解可以显式赋值，如果没有默认值，必须给注解赋值
    @MyAnnotation(name = "liangbingtao",schools = {"西北大学","西工大"})
    public void test(){

    }

    @MyAnnotation3("liangbingtao")
    public void test2(){

    }



    @Target({ElementType.TYPE, ElementType.METHOD})//type表示可以用在类，接口和声明上；method表示可以用在方法上
    @Retention(RetentionPolicy.RUNTIME)
    @interface MyAnnotation {
        //注解的参数：参数类型 +参数名()
        //不是一个方法！！！
        String name() default "";   //这个name是注解的参数名
        int age() default 0;
        int id() default -1;//如果默认值为-1，代表不存在。
        String[] schools();
    }

    @Target({ElementType.TYPE, ElementType.METHOD})//type表示可以用在类，接口和声明上；method表示可以用在方法上
    @Retention(RetentionPolicy.RUNTIME)
    @interface MyAnnotation3{
        String value(); //如果只有一个值，建议用value命名
    }
}
