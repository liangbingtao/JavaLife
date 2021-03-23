package com.neo.study.Runnable.demo02;

/**
 * @Description Author neo
 * Date 2021/3/20 10:20
 */
public class Producer implements Runnable {

    private Info info = null;

    public Producer(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        boolean flag = false;     //定义标记位
        for (int i = 0; i < 50; i++) {
            if (flag) {
                this.info.setName("李兴华");
                try {
                    Thread.sleep(90);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.info.setContent("JAVA讲师");
                flag = false;
            } else {
                this.info.setName("mldn");
                try {
                    Thread.sleep(90);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.info.setContent("www.baidu.com");
                flag = true;
            }
        }

    }
}
