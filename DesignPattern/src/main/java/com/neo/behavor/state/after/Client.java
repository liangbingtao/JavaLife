package com.neo.behavor.state.after;

/**
 * @Author : neo
 * @Date 2021/3/28 11:01
 * @Description : 客户端
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(Context.STOPPING_STATE);


        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
