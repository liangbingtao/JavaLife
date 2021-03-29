package com.neo.behavor.visitor;


import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : neo
 * @Date 2021/3/29 9:26
 * @Description : 对象结构角色
 */
public class Home {
    private List<Animal> nodeList = new ArrayList<Animal>();


    //添加元素
    public void add(Animal animal) {
        nodeList.add(animal);
    }

    //遍历集合获取每一个元素，让访问者访问每一个元素
    public void action(Person person){
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }
}
