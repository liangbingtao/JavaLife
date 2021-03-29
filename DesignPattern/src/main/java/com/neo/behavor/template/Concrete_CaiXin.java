package com.neo.behavor.template;

/**
 * @Author : neo
 * @Date 2021/3/26 17:16
 * @Description : 具体类（菜心），需要覆写父类中的抽象方法
 */
public class Concrete_CaiXin extends AbstractClass{
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    public void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}
