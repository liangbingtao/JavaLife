package com.neo.behavor.state.after;

/**
 * @Author : neo
 * @Date 2021/3/28 10:24
 * @Description :电梯类： 抽象状态角色，用来封装环境对象中的特定状态所对应的行为
 */
public abstract class LiftState {

    //定义一个环境角色,也就是封装状态的变化引起的功能变化
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //电梯开门动作
    public abstract void open();

    //电梯关门动作
    public abstract void close();

    //电梯运行动作
    public abstract void run();

    //电梯停止动作
    public abstract void stop();
}
