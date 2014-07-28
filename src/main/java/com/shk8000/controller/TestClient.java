package com.shk8000.controller;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shk8000.pojo.Person;

public class TestClient {
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-all.xml");
		System.out.println(context);
		
		Person person = context.getBean("chinese_aop",Person.class);  
		person.sayHello("jack");  
	      
	    person.eat("米饭",new Date());  
	      
	    person.eat2("米饭",new Date(),"test");  
		
	}

}
