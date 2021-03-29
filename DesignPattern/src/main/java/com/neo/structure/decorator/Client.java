package com.neo.structure.decorator;

/**
 * @Author : neo
 * @Date 2021/3/24 20:00
 * @Description : 测试类
 */
public class Client {
    public static void main(String[] args) {

        //点一份炒饭
        FiredRice firedRice = new FiredRice();
        //花费的价格
        System.out.println(firedRice.getDesc() + " " + firedRice.cost() + "元");

        System.out.println("=====================");

        //点一份加鸡蛋的炒面
        FiredNoodles firedNoodles = new FiredNoodles();
        FastFood noodlesWithEgg = new Egg(firedNoodles);
        System.out.println(noodlesWithEgg.getDesc() + " " + noodlesWithEgg.cost() + "元");

        System.out.println("=======================");
        //点一份加鸡蛋和培根的炒饭
        FastFood firedRice1 = new FiredRice();
        FastFood food1 = new Egg(firedRice1);
        FastFood food2 = new Bacon(food1);
        System.out.println(food2.getDesc() + " " + food2.cost() + "元");

    }
}
