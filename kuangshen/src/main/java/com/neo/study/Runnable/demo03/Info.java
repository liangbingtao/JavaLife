package com.neo.study.Runnable.demo03;

/**
 * @Description Author neo
 * Date 2021/3/20 10:17
 */
public class Info {     //定义信息类
    private String name = "李兴华";      //信息名称，指定默认值
    private String content = "JAVA讲师";    //信息内容，指定默认值
    boolean flag = false;   //增加标志位，让生产与消费依次进行

    public synchronized void set(String name, String content) {
        if (!flag) {         //如果falg=false,表示可以取走，但是不能生产，如果生产者线程运行，则消费者线程应该等待
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setName(name);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setContent(content);
        flag = false;       //修改标志位，表示可以取走
        super.notify();     //唤醒等待线程
    }

    public synchronized void get() {
        if (flag) {
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName() + "-->" + this.getContent());
        flag = true;    //设置flag=true,表示可以生产，不能取走
        super.notify(); //唤醒等待线程
    }


    ////setter和getter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
