package com.shk8000.controller;

import javax.annotation.Resource;
import javax.management.Notification;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedNotification;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.jmx.export.notification.NotificationPublisher;
import org.springframework.jmx.export.notification.NotificationPublisherAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import redis.clients.jedis.Jedis;

import com.shk8000.pojo.TestHello;
import com.shk8000.util.JedisUtil;

@Controller
@ManagedResource(objectName="test:name=TestController")
@ManagedNotification(notificationTypes="test.notification", name="test")
public class TestController implements NotificationPublisherAware {
	
	Logger logger = LoggerFactory.getLogger(TestController.class);
	
	public static int DEFAULT_NUM = 10;
	
	private int mvalue = DEFAULT_NUM;
	
	@Resource
	public TestBean tb;
	
	@Resource
	public TestBean2 tb2;
	
	@Autowired
	private TestHello testin;
	
	private NotificationPublisher notificationPublisher;
	
//	public NotificationPublisher getNotificationPublisher() {
//		return notificationPublisher;
//	}

	public void setNotificationPublisher(NotificationPublisher notificationPublisher) {
		this.notificationPublisher = notificationPublisher;
	}

	@ManagedAttribute
	public int getMvalue() {
		return mvalue;
	}
	
	@ManagedAttribute
	public void setMvalue(int mvalue) {
		this.mvalue = mvalue;
	}

	public static void main(String[] args){
		System.out.println("testing!!!!!!!!!!!!!!!");
	}
	
	public static Jedis jedis = null;
	
	static{
		jedis = JedisUtil.getPool("220.181.8.35", 6379).getResource();
	}
	
	@RequestMapping(value="index")
	public String index_page(Model model, HttpServletRequest request){
		System.out.println("tesrrrrting!!!!!!!@@@@!!!!!!!!");
		
		jedis.set("hello", "world");
		logger.info("hahahahahahah111111111111111");
//		System.out.println(testHello.sayHello("shk"));
		model.addAttribute("shk8000", "spring!");
//		postMessage();
//		TestBean tb = new TestBean();
//		tb.setName("fff");
//		tb.add(5, 3);
		System.out.println(tb.getName()+"   "+tb2.getName()+"   "+tb.add(5, 6)+"  "+tb2.add(5, 6));
//		tb.add(5, 6);
//		tb2.add(5, 6);
		HttpSession  hs = request.getSession();
		hs.getAttributeNames();
	
		Cookie[] cookies = request.getCookies();
		  if(cookies == null){
			  System.out.println("ffff");
		  }else{
			  System.out.println("ffff11");
		  }
		   
		System.out.println("show.jsp");
		return "show";
	}
	
	public void postMessage(){
		notificationPublisher.sendNotification(new Notification("hi,baby!", this, 0));
	}

}
