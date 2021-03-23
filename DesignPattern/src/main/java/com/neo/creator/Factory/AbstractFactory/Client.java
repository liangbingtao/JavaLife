package com.neo.creator.Factory.AbstractFactory;

/**
 * @Description Author neo
 * Date 2021/3/19 17:54
 */
public class Client {
    public static void main(String[] args) {
        AmericanDessertFactory americanDessertFactory=new AmericanDessertFactory();
        Coffee coffee = americanDessertFactory.createCoffee();
        Dessert dessert = americanDessertFactory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
