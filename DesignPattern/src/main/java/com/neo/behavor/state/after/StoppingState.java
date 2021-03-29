package com.neo.behavor.state.after;

/**
 * @Author : neo
 * @Date 2021/3/28 10:32
 * @Description : 具体角色类
 */
public class StoppingState extends LiftState{

    //停止状态可以开门
    public void open() {
        //修改状态
        super.context.setLiftState(Context.OPENNING_STATE);
        //调用父类中context中的open方法
        super.context.open();

    }

    //停滞状态下，可以关门
    public void close() {
        //修改状态
        super.context.setLiftState(Context.CLOSING_STATE);
        //调用父类中context中的open方法
        super.context.close();
    }

    //停止状态下可以运行
    public void run() {
        //修改状态
        super.context.setLiftState(Context.RUNNING_STATE);
        //调用父类中context中的open方法
        super.context.run();

    }

    //当前对象要执行的方法
    public void stop() {
        System.out.println("电梯停止了...");
    }
}
