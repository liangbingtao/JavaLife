package com.neo.creator.Factory.AbstractFactory;

/**
 * @Description Author neo
 * Date 2021/3/19 17:52
 */
public class ItealyDessertFactory implements DessertFactory{
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    public Dessert createDessert() {
        return new Trimisu();
    }
}
