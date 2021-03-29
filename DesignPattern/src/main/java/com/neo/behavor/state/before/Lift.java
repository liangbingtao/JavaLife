package com.neo.behavor.state.before;

/**
 * @Author : neo
 * @Date 2021/3/28 9:50
 * @Description : 电梯类
 */
public class Lift implements ILift {

    //定义一个变量表示电梯当前状态
    private int state;

    public void setState(int state) {
        this.state = state;
    }

    //执行开门动作
    public void open() {
        switch (state) {
            case OPENING_STATE: //门已经开了，不能再打开
                //do nothing
                break;
            case CLOSING_STATE: //关门状态，可以开门
                System.out.println("j电梯门打开了");
                this.setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                //do nothing
                break;
            case STOPPING_STATE:
                System.out.println("电梯门打开了");
                this.setState(OPENING_STATE);
                break;
        }

    }

    public void close() {
        switch (this.state) {
            case OPENING_STATE:
                System.out.println("电梯关门了。。。");//只有开门状态可以关闭电梯门，可以对应电梯状态表来看
                this.setState(CLOSING_STATE);//关门之后电梯就是关闭状态了
                break;
            case CLOSING_STATE:
                //do nothing //已经是关门状态，不能关门
                break;
            case RUNNING_STATE:
                //do nothing //运行时电梯门是关着的，不能关门
                break;
            case STOPPING_STATE:
                //do nothing //停止时电梯也是关着的，不能关门
                break;
        }
    }

    public void run() {
        switch (this.state) {
            case OPENING_STATE://电梯不能开着门就走
                //do nothing
                break;
            case CLOSING_STATE://门关了，可以运行了
                System.out.println("电梯开始运行了。。。");
                this.setState(RUNNING_STATE);//现在是运行状态
                break;
            case RUNNING_STATE:
                //do nothing 已经是运行状态了
                break;
            case STOPPING_STATE:
                System.out.println("电梯开始运行了。。。");
                this.setState(RUNNING_STATE);
                break;
        }
    }

    public void stop() {
        switch (this.state) {
            case OPENING_STATE: //开门的电梯已经是是停止的了(正常情况下)
                //do nothing
                break;
            case CLOSING_STATE://关门时才可以停止
                System.out.println("电梯停止了。。。");
                this.setState(STOPPING_STATE);
                break;
            case RUNNING_STATE://运行时当然可以停止了
                System.out.println("电梯停止了。。。");
                this.setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                //do nothing
                break;
        }
    }
}
