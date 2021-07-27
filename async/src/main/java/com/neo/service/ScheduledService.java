package com.neo.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @Author : neo
 * @Date 2021/7/24 11:17
 * @Description : TODO
 */
@Service
public class ScheduledService {

    //在一个特定的时间执行这个方法
    //cron表达式
    //秒 分 时 日 月 周几,每两秒执行一次
    @Scheduled(cron = "0/2 * * * * ? ")
    public void hello(){
        System.out.println("定时任务执行了...");
    }
}
