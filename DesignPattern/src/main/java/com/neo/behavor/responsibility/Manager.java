package com.neo.behavor.responsibility;

/**
 * @Author : neo
 * @Date 2021/3/27 17:35
 * @Description : 部门经理（具体处理者）
 */
public class Manager extends Handler {


    public Manager() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    public void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent() + "。");
        System.out.println("部门经理审批：同意！");
    }
}
