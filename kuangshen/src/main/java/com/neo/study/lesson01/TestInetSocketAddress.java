package com.neo.study.lesson01;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/**
 * @Description Author neo
 * Date 2020/11/24 11:05
 */

public class TestInetSocketAddress {
    public static void main(String[] args) {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 8080);
        InetSocketAddress inetSocketAddress2 = new InetSocketAddress("localhost", 8080);
        System.out.println(inetSocketAddress);
        System.out.println(inetSocketAddress2);

        System.out.println(inetSocketAddress.getAddress());
        System.out.println(inetSocketAddress.getHostName());//地址
        System.out.println(inetSocketAddress.getPort());//端口
    }
}
