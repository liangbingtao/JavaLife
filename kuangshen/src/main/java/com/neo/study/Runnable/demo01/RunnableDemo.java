package com.neo.study.Runnable.demo01;

/**
 * @Description Author neo
 * Date 2021/3/20 0:03
 */
public class RunnableDemo {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("线程A",1000);
        MyThread myThread2 = new MyThread("线程B",2000);
        MyThread myThread3 = new MyThread("线程C",5000);

        //启动三个线程
        new Thread(myThread1).start();
        new Thread(myThread2).start();
        new Thread(myThread3).start();

    }
}
