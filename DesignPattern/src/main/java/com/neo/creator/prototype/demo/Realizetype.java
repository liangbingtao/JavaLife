package com.neo.creator.prototype.demo;

/**
 * @Author : neo
 * @Date 2021/3/29 15:13
 * @Description : TODO
 */
public class Realizetype implements Cloneable {

    //构造方法
    public Realizetype() {
        System.out.println("具体的原型对象创建完成！");
    }


    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}
