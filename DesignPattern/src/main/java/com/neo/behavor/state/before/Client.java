package com.neo.behavor.state.before;

/**
 * @Author : neo
 * @Date 2021/3/28 9:58
 * @Description : TODO
 */
public class Client {
    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.setState(ILift.RUNNING_STATE);
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
