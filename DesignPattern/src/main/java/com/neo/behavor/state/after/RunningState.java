package com.neo.behavor.state.after;

/**
 * @Author : neo
 * @Date 2021/3/28 10:32
 * @Description : 具体角色类
 */
public class RunningState extends LiftState {

    //运行中不能开门
    public void open() {
        //do nothing
    }

    //运行状态就是关闭状态
    public void close() {
        //do nothing
    }

    //运行状态要执行的操作
    public void run() {
        System.out.println("电梯正在运行...");
    }

    //运行状态下可以停止
    public void stop() {
        //修改状态
        super.context.setLiftState(Context.STOPPING_STATE);
        //调用父类中context中的stop方法
        super.context.stop();

    }
}
