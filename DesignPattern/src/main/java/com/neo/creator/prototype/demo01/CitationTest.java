package com.neo.creator.prototype.demo01;

/**
 * @Description Author neo
 * Date 2021/3/20 15:33
 */
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        //1.创建原型对象
        Citation citation = new Citation();

        Citation citation1 = citation.clone();
        citation.setName("张三");
        citation1.setName("李四");

        citation.show();
        citation1.show();

    }
}
