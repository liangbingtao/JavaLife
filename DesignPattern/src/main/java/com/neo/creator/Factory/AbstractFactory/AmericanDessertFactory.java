package com.neo.creator.Factory.AbstractFactory;

/**
 * @Description Author neo
 * Date 2021/3/19 17:51
 */
public class AmericanDessertFactory implements DessertFactory {
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
