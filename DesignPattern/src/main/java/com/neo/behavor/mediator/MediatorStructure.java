package com.neo.behavor.mediator;

/**
 * @Author : neo
 * @Date 2021/3/28 15:29
 * @Description : 具体中介类
 */
public class MediatorStructure extends Mediator {

    //聚合租房者与房主
    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }


    public void communicate(String message, Person person) {
        if (person == houseOwner) {      //如果是房主与中介联系，则中介将消息传达给租户
            tenant.getMessage(message);
        } else {     //如果是租户和中介联系，则中介将消息传达给房主
            houseOwner.getMessage(message);
        }
    }
}
