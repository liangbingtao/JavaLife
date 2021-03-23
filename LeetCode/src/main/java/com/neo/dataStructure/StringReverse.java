package com.neo.dataStructure;

import sun.rmi.server.InactiveGroupException;

/**
 * @Description Author neo
 * Date 2021/3/13 21:36
 */
public class StringReverse {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;

        String s1 = s.substring(k);
        String s2 = s.substring(0, k);
        System.out.println((s1 + s2));
        System.out.println(s1);
        System.out.println(s2);

    }

}
