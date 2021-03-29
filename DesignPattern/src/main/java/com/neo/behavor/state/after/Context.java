package com.neo.behavor.state.after;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @Author : neo
 * @Date 2021/3/28 10:23
 * @Description : 环境角色，定义了客户程序需要的接口，维护一个当前状态，
 * 并将与状态相关的操作委托给当前状态对象来处理
 */
public class Context {

    //定义所有电梯的状态
    public static final OpenningState OPENNING_STATE = new OpenningState();
    public static final ClosingState CLOSING_STATE = new ClosingState();
    public static final RunningState RUNNING_STATE = new RunningState();
    public static final StoppingState STOPPING_STATE = new StoppingState();

    //定义一个当前电梯状态
    private LiftState liftState;

    public void setLiftState(LiftState liftState) {
        //当前环境改变
        this.liftState = liftState;
        //把当前的环境通知到各个实现类中
        this.liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }

    public void close(){
        this.liftState.close();
    }

    public void run(){
        this.liftState.run();
    }

    public void stop(){
        this.liftState.stop();
    }
}
