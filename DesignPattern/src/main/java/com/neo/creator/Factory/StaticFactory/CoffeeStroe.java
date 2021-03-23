package com.neo.creator.Factory.StaticFactory;


/**
 * @Description Author neo
 * Date 2021/3/19 17:29
 */
public class CoffeeStroe {

    public Coffee orderCoffee(String type) {

        Coffee coffee = SimpleFactory.createCoffee(type);

        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
