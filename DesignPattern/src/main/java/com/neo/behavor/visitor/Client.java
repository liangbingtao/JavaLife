package com.neo.behavor.visitor;

/**
 * @Author : neo
 * @Date 2021/3/29 9:30
 * @Description : TODO
 */
public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.add(new Dog());
        home.add(new Cat());

        Owner owner = new Owner();
        home.action(owner);

        Someone someone = new Someone();
        home.action(someone);
    }
}
