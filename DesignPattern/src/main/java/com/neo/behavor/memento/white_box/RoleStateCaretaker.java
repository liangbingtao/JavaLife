package com.neo.behavor.memento.white_box;

/**
 * @Author : neo
 * @Date 2021/3/29 10:29
 * @Description : 角色状态管理者
 */
public class RoleStateCaretaker {

    //创建备忘录变量
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
