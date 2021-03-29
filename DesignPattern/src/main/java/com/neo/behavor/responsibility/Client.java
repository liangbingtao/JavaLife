package com.neo.behavor.responsibility;

/**
 * @Author : neo
 * @Date 2021/3/27 17:42
 * @Description : 测试类
 */
public class Client {
    public static void main(String[] args) {

        //请假条
        LeaveRequest leaveRequest = new LeaveRequest("张三", 2, "身体不适");
        //各级领导
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        //之所以在这里设置上级领导，是因为可以根据实际需求来更改设置，
        // 如果实战中上级领导人都是固定的，则可以移到领导实现类中

        //小组长的领导是部门经理
        groupLeader.setNextHandler(manager);
        //部门经理的领导是总经理
        manager.setNextHandler(generalManager);

        groupLeader.submit(leaveRequest);

    }
}
