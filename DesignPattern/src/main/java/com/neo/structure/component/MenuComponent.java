package com.neo.structure.component;

/**
 * @Author : neo
 * @Date 2021/3/25 19:40
 * @Description : 菜单组件（抽象根节点）
 */
public abstract class MenuComponent {
    protected String name;
    protected int level;

    //添加菜单
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    //移除菜单
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    //获取指定的子菜单
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    //获取菜单名称
    public String getName() {
        return name;
    }

    //打印菜单名称的方法（包含子菜单和子菜单项）
    public abstract void print();
}
