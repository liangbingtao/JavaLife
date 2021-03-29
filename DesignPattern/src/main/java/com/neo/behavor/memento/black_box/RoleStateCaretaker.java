package com.neo.behavor.memento.black_box;

import com.neo.behavor.mediator.Mediator;
import com.neo.behavor.memento.white_box.RoleStateMemento;

/**
 * @Author : neo
 * @Date 2021/3/29 10:29
 * @Description : 角色状态管理者
 */
public class RoleStateCaretaker{

    //创建备忘录变量
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
