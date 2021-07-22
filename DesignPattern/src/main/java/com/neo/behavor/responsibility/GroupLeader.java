package com.neo.behavor.responsibility;

/**
 * @Author : neo
 * @Date 2021/3/27 17:35
 * @Description : 小组长（具体处理者）
 */
public class GroupLeader extends Handler {


    public GroupLeader() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    public void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent() + "。");
        System.out.println("小组长审批：同意！");
    }
}
