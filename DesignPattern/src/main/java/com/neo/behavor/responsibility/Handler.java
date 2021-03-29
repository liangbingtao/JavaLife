package com.neo.behavor.responsibility;

/**
 * @Author : neo
 * @Date 2021/3/27 17:23
 * @Description : 抽象处理者角色
 */
public abstract class Handler {

    //各级领导能够处理的请假天数上界
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    //请假的起始和终止天数
    private int numStart;
    private int numEnd;

    private Handler nextHandler;

    //设置请假天数范围 上不封顶
    public Handler(int numStart) {
        this.numStart = numStart;
    }

    //设置请假天数范围
    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    //设置上级领导
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //提交请假条
    public final void submit(LeaveRequest leave) {
        if (0 == this.numStart) {
            return;
        }

        // 如果请假天数达到该领导者的处理要求
        if(leave.getNum() >= this.numStart){
            this.handleLeave(leave);

            //如果还有上级 并且请假天数超过了当前领导的处理范围
            if(null != this.nextHandler && leave.getNum() > numEnd){
                this.nextHandler.submit(leave);//继续提交
            } else {
                System.out.println("流程结束");
            }
        }

    }

    //各级领导处理请假条的方法
    public abstract void handleLeave(LeaveRequest leave);

}
