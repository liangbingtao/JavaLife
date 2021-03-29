package com.neo.behavor.visitor;

import com.neo.behavor.visitor.*;

/**
 * @Author : neo
 * @Date 2021/3/29 9:22
 * @Description : 具体元素类
 */
public class Dog implements Animal {
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好好吃，汪汪汪~~~");
    }
}
