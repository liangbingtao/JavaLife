package com.neo.behavor.command;

import java.util.ArrayList;

/**
 * @Author : neo
 * @Date 2021/3/27 15:45
 * @Description : 服务员类（调用者角色，要求命令对象执行请求，通常会持有命令对象，可以持有很多命令对象）
 */
public class Waiter {

    //持有命令对象，可以持有很多的命令对象
    private ArrayList<Command> commands;

    public Waiter() {
        this.commands = new ArrayList<Command>();
    }

    public void setCommands(Command cmd) {
        //把cmd对象存储到list集合中
        commands.add(cmd);
    }

    //发出命令，喊 订单来了，厨师开始执行
    public void orderUp() {
        System.out.println("服务员：叮咚，大厨，订单来了...");
        for (Command command : commands) {
            if (command != null) {
                command.execute();
            }
        }

    }
}
