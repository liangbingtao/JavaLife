package com.neo.structure.adapter.classAdapter;

/**
 * @Author : neo
 * @Date 2021/3/24 14:02
 * @Description : TODO
 */
public class SDCardImpl implements SDCard {
    public String readSDCard() {
        String msg = "sd card read a msg : hello world sdCard";
        return msg;
    }

    public void writeSDCard(String msg) {
        System.out.println("SDCard write a msg : " + msg);
    }
}
