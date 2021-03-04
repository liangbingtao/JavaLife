package com.neo.study.lesson01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Description Author neo
 * Date 2020/11/23 22:53
 */

//测试获取IP地址
public class TestInetAddress {
    public static void main(String[] args) throws UnknownHostException {

        //获取本机的信息
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("计算机名：" + localHost.getHostName());
        System.out.println("本机地址：" + localHost.getAddress());
        try {
            //查询本机地址
            InetAddress inetAddresses1 = InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddresses1);
            //通过localhost获取本机地址
            InetAddress inetAddresses3 = InetAddress.getByName("localhost");
            System.out.println(inetAddresses3);

            //查询网站ip地址
            InetAddress inetAddresses2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddresses2);

            //常用方法
            System.out.println(inetAddresses2.getAddress());
            System.out.println(inetAddresses2.getHostName());//域名或者你自己电脑的名字
            System.out.println(inetAddresses2.getHostAddress());//ip
            System.out.println(inetAddresses2.getCanonicalHostName());  //规范的主机名


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


    }
}
