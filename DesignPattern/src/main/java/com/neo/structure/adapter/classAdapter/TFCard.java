package com.neo.structure.adapter.classAdapter;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * @Author : neo
 * @Date 2021/3/24 13:57
 * @Description : 适配者类（TF卡）
 */
public interface TFCard {

    //从TF卡中读取数据
    public String readTF();

    //向TF卡中写入数据
    void WriteTF(String msg);
}
