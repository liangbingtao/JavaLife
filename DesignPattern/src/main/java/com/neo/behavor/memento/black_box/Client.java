package com.neo.behavor.memento.black_box;

/**
 * @Author : neo
 * @Date 2021/3/29 10:30
 * @Description : 测试类
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("-------------------大战Boss前--------------------------");

        //创建游戏角色对象
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();

        //保存进度
        //创建管理者角色
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(gameRole.saveState());

        System.out.println("-------------------大战Boss后--------------------------");

        //大战boss时，损耗严重
        gameRole.fight();
        gameRole.stateDisplay();
        System.out.println("-------------------恢复之前状态-----------------------------------");
        //恢复之前状态
        gameRole.recoverState(roleStateCaretaker.getMemento());
        gameRole.stateDisplay();
    }
}
