package com.neo.structure.adapter.classAdapter;

/**
 * @Author : neo
 * @Date 2021/3/24 14:01
 * @Description : 目标接口（SD卡）
 */
public interface SDCard {

    String readSDCard();

    void writeSDCard(String msg);

}
