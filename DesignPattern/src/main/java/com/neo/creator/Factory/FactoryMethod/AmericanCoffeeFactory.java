package com.neo.creator.Factory.FactoryMethod;

/**
 * @Description Author neo
 * Date 2021/3/19 17:39
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
