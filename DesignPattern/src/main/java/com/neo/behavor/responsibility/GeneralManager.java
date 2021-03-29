package com.neo.behavor.responsibility;

/**
 * @Author : neo
 * @Date 2021/3/27 17:35
 * @Description : 总经理（具体处理者）
 */
public class GeneralManager extends Handler {


    public GeneralManager() {
        super(Handler.NUM_THREE);
    }

    public void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent() + "。");
        System.out.println("总经理审批：同意！");
    }
}
