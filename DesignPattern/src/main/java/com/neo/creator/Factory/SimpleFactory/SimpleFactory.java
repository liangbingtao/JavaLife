package com.neo.creator.Factory.SimpleFactory;

/**
 * @Description Author neo
 * Date 2021/3/19 17:24
 */
public class SimpleFactory {

    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("您点的咖啡卖完了");
        }
        return coffee;
    }
}
