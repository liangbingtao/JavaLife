package com.neo.behavor.visitor;

import com.neo.behavor.visitor.Person;

/**
 * @Author : neo
 * @Date 2021/3/29 9:17
 * @Description : 宠物类（抽象元素对象）
 */
public interface Animal {

    void accept(Person person);
}
