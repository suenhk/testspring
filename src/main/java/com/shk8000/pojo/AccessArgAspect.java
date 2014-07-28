package com.shk8000.pojo;

import java.util.Arrays;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class AccessArgAspect {
	
	public void access(Date time, String food, String retval){
		System.out.println("");
		System.out.println("目标方法中 String参数为："+food);
		System.out.println("目标方法中 String参数为："+time);
		System.out.println("目标方法中 返回值："+retval);
		System.out.println("模拟记录日志。。。");
	}
	
	public void accessWithJoinPoint(JoinPoint jp, Date time, String food){
		System.out.println("");
		System.out.println("JoinPoint.getArgs()获取参数列表： "+Arrays.toString(jp.getArgs()));
		System.out.println("JoinPoint jp ---- 目标方法中 String参数为："+food);
		System.out.println("JoinPoint jp ---- 目标方法中 String参数为："+time);
		System.out.println("JoinPoint jp ---- 模拟记录日志...");
	}

}
