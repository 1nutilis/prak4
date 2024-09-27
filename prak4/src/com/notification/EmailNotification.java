package com.notification;

public class EmailNotification implements INotification {
    public void sendNotification(String message) {
        System.out.println("Email отправлено: " + message);
    }
}