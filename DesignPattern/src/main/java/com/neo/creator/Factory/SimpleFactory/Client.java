package com.neo.creator.Factory.SimpleFactory;

/**
 * @Description Author neo
 * Date 2021/3/19 17:28
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStroe stroe = new CoffeeStroe();
        Coffee coffee = stroe.orderCoffee("american");
        System.out.println(coffee.getName());
    }
}
