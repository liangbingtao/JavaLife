package com.neo.structure.decorator;

/**
 * @Author : neo
 * @Date 2021/3/24 19:46
 * @Description : 炒饭（具体构件角色）
 */
public class FiredRice extends FastFood {

    public FiredRice() {
    super(10,"炒饭");
    }


    public float cost() {
        return getPrice();
    }
}
