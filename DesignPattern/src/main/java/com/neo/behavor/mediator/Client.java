package com.neo.behavor.mediator;

/**
 * @Author : neo
 * @Date 2021/3/28 15:34
 * @Description : 测试类
 */
public class Client {
    public static void main(String[] args) {
        //一个房主，一个租户，一个中介
        MediatorStructure mediatorStructure = new MediatorStructure();
        //房主和租户只需要知道中介机构即可
        Tenant tenant = new Tenant("张三", mediatorStructure);
        HouseOwner houseOwner = new HouseOwner("李四", mediatorStructure);

        //中介机构要知道租户和房主
        mediatorStructure.setHouseOwner(houseOwner);
        mediatorStructure.setTenant(tenant);

        tenant.communicate("我需要租三室的房子");
        houseOwner.communicate("我这里有三室的房子，你要租吗？");
    }
}
