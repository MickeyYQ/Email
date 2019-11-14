package com.example.demo.menu;

import org.springframework.mail.SimpleMailMessage;

import java.util.Date;
import java.util.Properties;

public class SendEmail {

    public boolean sendEmail(){
        Properties props = new Properties();
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("");
        message.setTo("");
        message.setSubject("主题");
        message.setText("Test!");
        message.setSentDate(new Date());


        return false;
    }
}
