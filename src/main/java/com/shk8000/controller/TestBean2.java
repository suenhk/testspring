package com.shk8000.controller;

import javax.management.Notification;

import org.springframework.jmx.export.notification.NotificationPublisher;
import org.springframework.jmx.export.notification.NotificationPublisherAware;

public class TestBean2 implements NotificationPublisherAware  {

	private String name;
    private int age;
    private boolean isSuperman;
    private NotificationPublisher publisher;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int add(int x, int y) {
        int answer = x + y;
        this.publisher.sendNotification(new Notification("hi add2", this, 0));
        
        return answer;
    }

    public void dontExposeMe() {
        throw new RuntimeException();
    }
    
    public void setNotificationPublisher(NotificationPublisher notificationPublisher) {
        this.publisher = notificationPublisher;
    }

}
