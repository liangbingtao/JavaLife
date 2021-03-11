package com.neo.demo01;

/**
 * @Description Author neo
 * Date 2021/3/4 19:52
 */

//客户--租房者
public class Client {

    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();
        // host.rent();

        //代理，中介帮房东租房子,但是代理角色一般会有一些附属操作，如看房子，收中介费
        //你不用面对房东，直接找中介租房即可
        Proxy proxy = new Proxy(host);
        proxy.seeHouse();
        proxy.fee();
        proxy.hetong();
        proxy.rent();
    }
}
