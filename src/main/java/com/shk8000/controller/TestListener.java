package com.shk8000.controller;

import javax.management.Notification;
import javax.management.NotificationListener;

import org.springframework.jmx.export.annotation.ManagedResource;

@ManagedResource(objectName="test:name=TestListener")
public class TestListener implements NotificationListener {
	
	public void handleNotification(Notification notification, Object handback){
		System.out.println("嗯哼！");
	}

}
