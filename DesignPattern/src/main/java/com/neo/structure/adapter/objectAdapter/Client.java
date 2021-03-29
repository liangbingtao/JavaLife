package com.neo.structure.adapter.objectAdapter;

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

        TFCard tfCard = new TFCardImpl();
        SDAdapterTF sdAdapterTF = new SDAdapterTF(tfCard);
        System.out.println(computer.readSD(sdAdapterTF));


    }
}
