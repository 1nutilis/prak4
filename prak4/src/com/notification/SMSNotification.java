package com.notification;

public class SMSNotification implements INotification{
    public void sendNotification(String message) {
        System.out.println("SMS отправлено: " + message);
    }
}
