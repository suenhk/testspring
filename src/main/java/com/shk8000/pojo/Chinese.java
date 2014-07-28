package com.shk8000.pojo;

import java.util.Date;

public class Chinese implements Person {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return name+" testing Aop";
	}

	@Override
	public void eat(String food, Date time) {
		// TODO Auto-generated method stub
		System.out.println("eating:"+food+",time is:"+time);
	}

	@Override
	public void eat2(String food, Date time, String test) {
		// TODO Auto-generated method stub
		System.out.println("eating2:"+food+",time is:"+time+",test is:"+test);
	}

}
