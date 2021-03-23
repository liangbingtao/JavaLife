package com.neo.creator.Factory.FactoryMethod;

/**
 * @Description Author neo
 * Date 2021/3/19 17:43
 */
public class Client {
    public static void main(String[] args) {

        CoffeeStroe stroe = new CoffeeStroe();
        // AmericanCoffeeFactory factory = new AmericanCoffeeFactory();
        LatteCoffeeFactory factory = new LatteCoffeeFactory();
        stroe.setFactory(factory);
        Coffee coffee = stroe.orderCoffee();
        System.out.println(coffee.getName());
    }
}
