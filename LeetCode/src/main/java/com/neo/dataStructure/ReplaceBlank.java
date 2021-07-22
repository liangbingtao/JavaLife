package com.neo.dataStructure;

/**
 * @Description Author neo
 * Date 2021/3/12 14:21
 */

/**
 * 题目要求：实现一个函数，把字符串s中的每个空格替换成“%20”；
 * 如，输入s="we are happy";
 * 输出为：“we%20are%20happy”
 */
public class ReplaceBlank {
    public static void main(String[] args) {
        String s = "we are happy ";

//######################解法一#####################################
        //由于java中string字符串不可修改，因此我们需要准备一个空串存放结果

        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.toCharArray()[i] == ' ') {
                res += "%20";
            } else {
                res += s.toCharArray()[i];
            }
        }
        System.out.println(res.toString());

//###############解法二######################
        if (s == null || "".equals(s)) {
            System.out.println("输入为空~");
        } else {
            System.out.println(s.replaceAll(" ", "%20"));
        }

    }
}
