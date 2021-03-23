package com.neo.study.Runnable.demo01;

/**
 * @Description Author neo
 * Date 2021/3/20 0:01
 */
public class MyThread implements Runnable {
    private int time;
    private String name;

    public MyThread(String name, int time) {
        this.name = name;
        this.time = time;

    }

    @Override
    public void run() {
        try {
            Thread.sleep(this.time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.name + "线程,休眠" + this.time + "毫秒");

    }
}
