package com.neo.structure.flyweight;

import javax.swing.plaf.metal.MetalCheckBoxIcon;

/**
 * @Author : neo
 * @Date 2021/3/26 15:37
 * @Description : 测试类
 */
public class Clent {
    public static void main(String[] args) {
        //获取I图形对象
        AbstractBox ibox = BoxFactory.getInstance().getBox("I");
        ibox.display("灰色");

        //获取L图形对象
        AbstractBox lbox = BoxFactory.getInstance().getBox("L");
        lbox.display("绿色");

        //获取O图形对象
        AbstractBox obox = BoxFactory.getInstance().getBox("O");
        obox.display("灰色");

        //获取O图形对象
        AbstractBox oobox = BoxFactory.getInstance().getBox("O");
        oobox.display("红色");

        System.out.println("两次获取到的O图形对象是否是同一对象：" + (obox == oobox));
    }
}
