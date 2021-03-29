package com.neo.structure.adapter.classAdapter;

/**
 * @Author : neo
 * @Date 2021/3/24 14:06
 * @Description : TODO
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{

    public String readSDCard() {
        System.out.println("adapter read tf card");
        return readTF();
    }

    public void writeSDCard(String msg) {
        System.out.println("adapter write tf card");
        WriteTF(msg);
    }
}
