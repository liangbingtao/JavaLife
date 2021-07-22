package com.neo.behavor.template;

/**
 * @Author : neo
 * @Date 2021/3/26 17:10
 * @Description : 具体类（炒包菜），炒包菜是具体的实现类，需要覆写父类中的两个抽象方法
 */
public class ConcreteClass_BaoCai extends AbstractClass {

    //覆写父类中的抽象方法
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");

    }

    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
