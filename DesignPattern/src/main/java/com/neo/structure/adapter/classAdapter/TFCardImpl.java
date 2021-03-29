package com.neo.structure.adapter.classAdapter;

/**
 * @Author : neo
 * @Date 2021/3/24 13:59
 * @Description : TODO
 */
public class TFCardImpl implements TFCard {
    public String readTF() {
        String msg = "tf card read msg : hello world tf card";
        return msg;
    }

    public void WriteTF(String msg) {
        System.out.println("tf card write msg :" + msg);
    }
}
