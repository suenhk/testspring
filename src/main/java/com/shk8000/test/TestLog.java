package com.shk8000.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

public class TestLog {
	
	Logger logger = LoggerFactory.getLogger(TestLog.class);
	
	public void test(){
		String str = "456";
		for (int i=0; i<100; i++){
			logger.info("tettst:{} records {}", i,i);
		}
		System.out.println("sk************");
		System.out.println("sk************");
	}
	
	public static void main(String[] args){
		TestLog tb = new TestLog();
		tb.test();
		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		StatusPrinter.print(lc);
	}

}
