package com.neo.structure.component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : neo
 * @Date 2021/3/25 19:46
 * @Description : 菜单类（树枝节点）
 */
public class Menu extends MenuComponent{

    //因为菜单可以有多个子菜单或子菜单项
    private List<MenuComponent> menuComponentList;

    public Menu(String name,int level) {
        this.name=name;
        this.level=level;
        this.menuComponentList = new ArrayList<MenuComponent>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
       return menuComponentList.get(i);
    }

    public void print() {
        for (int i=1;i<level;i++){
            System.out.print("--");
        }
        System.out.println(name);
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }

    }
}
