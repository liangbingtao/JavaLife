package com.neo.behavor.state.after;

/**
 * @Author : neo
 * @Date 2021/3/28 10:29
 * @Description : 具体状态角色
 */
public class OpenningState extends LiftState {

    //当前状态要执行的操作
    public void open() {
        System.out.println("电梯门打开了...");
    }

    public void close() {
        //修改状态
        super.context.setLiftState(Context.CLOSING_STATE);
        //调用当前状态中的context中的
        super.context.close();
    }

    public void run() {
        //开门状态下不能运行
        //do  nothing

    }

    public void stop() {
        //开门状态下已经是停止的了 do nothing
    }
}
