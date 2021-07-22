package com.neo.study.Runnable.demo02;

import javax.swing.text.AbstractDocument;

/**
 * @Description Author neo
 * Date 2021/3/20 10:17
 */
public class Info {     //定义信息类
    private String name = "李兴华";      //信息名称，指定默认值
    private String content = "JAVA讲师";    //信息内容，指定默认值

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
