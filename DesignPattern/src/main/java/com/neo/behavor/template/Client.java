package com.neo.behavor.template;

/**
 * @Author : neo
 * @Date 2021/3/26 17:19
 * @Description : 测试类
 */
public class Client {
    public static void main(String[] args) {
        //手撕包菜
        ConcreteClass_BaoCai baoCai = new ConcreteClass_BaoCai();
        baoCai.cookProcess();
        System.out.println("===============================");
        //蒜蓉菜心
        Concrete_CaiXin caixin = new Concrete_CaiXin();
        caixin.cookProcess();
    }
}
