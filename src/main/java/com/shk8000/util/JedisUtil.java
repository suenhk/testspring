package com.shk8000.util;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisUtil {
	
	public static JedisPool pool = null;
	
	private static String masterIp = "220.181.8.35";
	private static int masterPort = 6379;
	private static String slaveIp = "220.181.8.199";
	private static int slavePort = 6379;
	
	public static JedisPool getPool(String ip, int port){
		JedisPoolConfig config = new JedisPoolConfig();  
	    config.setMaxActive(10);  
	    config.setMaxIdle(10);  
	    config.setMaxWait(10);  
	    config.setTestOnBorrow(true);  
	    config.setTestOnReturn(true);  
	    
	    try{    
	        /** 
	         *如果你遇到 java.net.SocketTimeoutException: Read timed out exception的异常信息 
	         *请尝试在构造JedisPool的时候设置自己的超时值. JedisPool默认的超时时间是2秒(单位毫秒) 
	         */  
	        pool = new JedisPool(config, ip, port, 10000);  
	    } catch(Exception e) {  
	        e.printStackTrace();  
	    }  
	    return pool;  
	}
	
	

}
