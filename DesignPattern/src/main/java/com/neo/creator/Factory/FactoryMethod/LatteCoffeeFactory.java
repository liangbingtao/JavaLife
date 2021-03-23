package com.neo.creator.Factory.FactoryMethod;

/**
 * @Description Author neo
 * Date 2021/3/19 17:40
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
