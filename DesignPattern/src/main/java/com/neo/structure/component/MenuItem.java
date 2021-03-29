package com.neo.structure.component;

/**
 * @Author : neo
 * @Date 2021/3/26 11:20
 * @Description : 子菜单项
 */
public class MenuItem extends MenuComponent {

    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void print() {
        for (int i = 1; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
