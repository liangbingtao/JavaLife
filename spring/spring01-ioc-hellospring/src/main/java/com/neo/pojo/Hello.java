package com.neo.pojo;

/**
 * @Description Author neo
 * Date 2021/1/23 15:57
 */
public class Hello {
    private String str;


    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
