package com.shk8000.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog {
	
	Logger logger = LoggerFactory.getLogger(TestLog.class);
	
	public void test(){
		String str = "456";
		logger.warn("tettst:{}", str);
	}
	
	public static void main(String[] args){
		TestLog tb = new TestLog();
		tb.test();
	}

}
