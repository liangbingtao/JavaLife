package com.neo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author : neo
 * @Date 2021/7/24 10:02
 * @Description : TODO
 */
@Service
public class AsyncService {
    // @Async注解加在方法上，告诉spring他是一个异步任务，并且要在启动类开启异步任务
    @Async
    public void hello(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("数据正在处理中......");
    }
}
