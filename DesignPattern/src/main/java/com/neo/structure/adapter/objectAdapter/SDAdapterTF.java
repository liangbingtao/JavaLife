package com.neo.structure.adapter.objectAdapter;

/**
 * @Author : neo
 * @Date 2021/3/24 14:06
 * @Description : TODO
 */
public class SDAdapterTF implements SDCard {

    //声明适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    public String readSDCard() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    public void writeSDCard(String msg) {
        System.out.println("adapter write tf card");
        tfCard.WriteTF(msg);
    }
}
