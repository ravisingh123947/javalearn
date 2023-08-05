package com.springbootdemo.javalearn;

public class NotificationFactory {
    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty())
            return null;

        if (channel == "SMS")
            return new Sms();

        else if (channel == "EMAIL")
            return new Email();

        else {
            throw new IllegalArgumentException("Unknown channel " + channel);
        }
    }
}
