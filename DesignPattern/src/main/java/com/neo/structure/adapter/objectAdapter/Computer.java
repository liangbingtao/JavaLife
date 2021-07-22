package com.neo.structure.adapter.objectAdapter;

/**
 * @Author : neo
 * @Date 2021/3/24 14:04
 * @Description : TODO
 */
public class Computer {

    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd card is null");
        }
        return sdCard.readSDCard();
    }
}
