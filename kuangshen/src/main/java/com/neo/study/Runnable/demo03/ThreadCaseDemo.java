package com.neo.study.Runnable.demo03;

/**
 * @Description Author neo
 * Date 2021/3/20 10:27
 */
public class ThreadCaseDemo {
    public static void main(String[] args) {
        Info info = new Info();
        Producer producer = new Producer(info);
        Consumer consumer = new Consumer(info);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
