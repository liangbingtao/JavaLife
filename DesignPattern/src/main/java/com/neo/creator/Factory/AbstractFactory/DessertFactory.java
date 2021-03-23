package com.neo.creator.Factory.AbstractFactory;

/**
 * @Description Author neo
 * Date 2021/3/19 17:50
 */
public interface DessertFactory {

    //生产咖啡
    public Coffee createCoffee();

    //生产甜品
    public Dessert createDessert();

}
