package com.neo.creator.Factory.FactoryMethod;


/**
 * @Description Author neo
 * Date 2021/3/19 17:29
 */
public class CoffeeStroe {

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }


}
