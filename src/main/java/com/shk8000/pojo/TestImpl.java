package com.shk8000.pojo;

import org.springframework.stereotype.Component;

@Component
public class TestImpl implements TestHello {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return name+" testing @@@@@";
	}

}
