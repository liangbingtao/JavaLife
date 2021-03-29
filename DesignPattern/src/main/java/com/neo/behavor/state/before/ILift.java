package com.neo.behavor.state.before;

/**
 * @Author : neo
 * @Date 2021/3/28 9:38
 * @Description : 电梯接口
 */
public interface ILift {

    //定义电梯的四个状态
    int OPENING_STATE=1;
    int CLOSING_STATE=2;
    int RUNNING_STATE=3;
    int STOPPING_STATE=4;


    //设置电梯状态
    void setState(int state);

    //电梯动作
    void open();
    void close();
    void run();
    void stop();

}
