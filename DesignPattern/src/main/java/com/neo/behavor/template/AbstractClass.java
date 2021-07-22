package com.neo.behavor.template;

/**
 * @Author : neo
 * @Date 2021/3/26 17:00
 * @Description : 抽象类，定义了模板方法和基本方法
 */
public abstract class AbstractClass {

    //模板方法，定义了算法的骨架和执行基本方法的顺序，不允许子类改写，故加上final关键字
    public final void cookProcess() {
        //倒油
        this.pourOil();
        //热油
        this.heatOil();
        //倒蔬菜
        this.pourVegetable();
        //倒调料
        this.pourSauce();
        //翻炒
        this.fry();

    }

    //基本方法，包括抽象方法和具体方法，具体方法是固定的，抽象方法是因执行者不同而不同，需要子类覆写
    //倒油，热油、翻炒这些步骤是一样的，所以直接实现，
    // 倒蔬菜和倒调味料是跟做的菜有关，是不一样的，定义成抽象方法，在子类中实现

    //第一步：倒油是一样的，直接实现
    public void pourOil() {
        System.out.println("倒油");
    }

    //第二步：热油是一样的，直接实现
    public void heatOil() {
        System.out.println("热油");
    }

    //第三步：倒蔬菜是不一样的（一个倒包菜，一个倒菜心）
    public abstract void pourVegetable();

    //第四步：倒调味料是不一样的
    public abstract void pourSauce();

    //第五步：翻炒是一样的，所以直接实现
    public void fry() {
        System.out.println("翻炒到熟出锅");
    }
}
