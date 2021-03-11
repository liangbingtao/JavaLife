package com.neo.demo01;


import sun.awt.ScrollPaneWheelScroller;

/**
 * @Description Author neo
 * Date 2021/3/4 19:54
 */
//代理角色--中介
public class Proxy implements Rent {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        host.rent();
    }

    //看房
    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    //收中介费
    public void fee() {
        System.out.println("中介收你中介费");
    }

    //签租赁合同
    public void hetong() {
        System.out.println("中介和你签合同");
    }
}
