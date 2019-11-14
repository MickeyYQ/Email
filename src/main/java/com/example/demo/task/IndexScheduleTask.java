package com.example.demo.task;

import com.example.demo.controller.IndexController;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling   // 2.开启定时任务
public class IndexScheduleTask {

    @Scheduled(cron = "0/5 * * * * ?")
    public void configureTasks() {

        System.out.println("开始准备。。。 " + LocalDateTime.now());
        IndexController ic = new IndexController();
        ic.email();

    }
}
