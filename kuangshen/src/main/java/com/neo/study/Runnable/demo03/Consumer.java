package com.neo.study.Runnable.demo03;

/**
 * @Description Author neo
 * Date 2021/3/20 10:24
 */
public class Consumer implements Runnable {

    private Info info;

    public Consumer(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.info.get();

        }
    }
}