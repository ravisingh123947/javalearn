package com.springbootdemo.javalearn;

public class Sms implements Notification{
    @Override
    public void userNotification() {
        System.out.println("sms notification sent!!");
    }
}
