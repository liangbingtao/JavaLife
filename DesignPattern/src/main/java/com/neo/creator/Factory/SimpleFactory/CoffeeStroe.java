package com.neo.creator.Factory.SimpleFactory;


/**
 * @Description Author neo
 * Date 2021/3/19 17:29
 */
public class CoffeeStroe {

    public Coffee orderCoffee(String type) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Coffee coffee = simpleFactory.createCoffee(type);

        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
