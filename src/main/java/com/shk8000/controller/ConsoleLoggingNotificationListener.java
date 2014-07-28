package com.shk8000.controller;

import javax.management.AttributeChangeNotification;
import javax.management.Notification;
import javax.management.NotificationFilter;
import javax.management.NotificationListener;

import com.shk8000.util.Popo;

public class ConsoleLoggingNotificationListener implements
		NotificationListener, NotificationFilter {

	@Override
	public boolean isNotificationEnabled(Notification notification) {
		// TODO Auto-generated method stub
		return true;//AttributeChangeNotification.class.isAssignableFrom(notification.getClass());
	}

	@Override
	public void handleNotification(Notification notification, Object handback) {
		// TODO Auto-generated method stub
		 System.out.println(notification);
	     System.out.println(handback);
	     System.out.println("the sun!");
//	     notification.getType();
	     Popo.send("Test spring jmx! "+notification.getType());
	}

}
