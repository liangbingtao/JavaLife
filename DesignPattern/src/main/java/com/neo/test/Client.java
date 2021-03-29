package com.neo.test;

import com.sun.jmx.snmp.agent.SnmpMibAgentMBean;

/**
 * @Author : neo
 * @Date 2021/3/26 22:13
 * @Description : TODO
 */
public class Client {
    public static void main(String[] args) {
        //创建经纪人类
        Agent agent = new Agent();
        //创建明星对象
        Star star = new Star("林青霞");
        agent.setStar(star);
        //创建粉丝对象
        Fans fans = new Fans("李四");
        agent.setFans(fans);
        //创建媒体公司对象
        Company company = new Company("媒体公司");
        agent.setCompany(company);

        agent.business();
        agent.meeting();
    }
}
