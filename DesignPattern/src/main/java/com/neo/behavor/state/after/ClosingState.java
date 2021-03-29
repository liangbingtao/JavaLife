package com.neo.behavor.state.after;

/**
 * @Author : neo
 * @Date 2021/3/28 10:29
 * @Description : 具体状态角色
 */
public class ClosingState extends LiftState {


    //关门状态下开启电梯门
    public void open() {
        //修改状态
        super.context.setLiftState(Context.OPENNING_STATE);
        //调用父类中context中的open方法
        super.context.open();
    }

    //要执行的方法
    public void close() {
        System.out.println("电梯门关闭...");

    }

    //关闭状态可以运行
    public void run() {
        //修改状态
        super.context.setLiftState(Context.RUNNING_STATE);
        //调用父类中context中的open方法
        super.context.run();
    }

    //关闭状态可以停止，不按楼层
    public void stop() {
        //修改状态
        super.context.setLiftState(Context.STOPPING_STATE);
        //调用父类中context中的open方法
        super.context.stop();
    }
}
