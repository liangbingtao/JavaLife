package com.neo.structure.adapter.classAdapter;

/**
 * @Author : neo
 * @Date 2021/3/24 14:08
 * @Description : TODO
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCardImpl sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));

        System.out.println("==========================");

        SDAdapterTF sdAdapterTF = new SDAdapterTF();
        System.out.println(computer.readSD(sdAdapterTF));
    }
}
