package com.example.demo.controller;

import com.example.demo.menu.SendEmail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class IndexController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void email() {
        logger.info("this.getClass()！" + this.getClass());

        SendEmail se = new SendEmail();
        System.out.println("开始发送邮件");
        logger.info("邮件发送成功！");
        se.sendEmail();
        System.out.println("邮件发送完成");

    }
}
