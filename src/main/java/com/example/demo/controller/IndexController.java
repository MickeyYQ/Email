package com.example.demo.controller;

import com.example.demo.menu.SendEmail;

public class IndexController {

    public void email() {
        SendEmail se = new SendEmail();
        System.out.println("开始发送邮件");

        se.sendEmail();
    }
}
