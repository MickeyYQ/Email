package com.example.demo.task;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Component
@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling   // 2.开启定时任务
public class DateScheduleTask {

    @Scheduled(cron = "5 * * * * ?")
    public void configureTasks() {
        Date date = new Date();

        System.out.println("执行静态定时任务时间: " + LocalDateTime.now());
        System.out.println("执行静态定时任务时间: " + date);
    }
}
