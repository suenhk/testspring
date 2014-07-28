package com.shk8000.util;

import java.util.Calendar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
	
	public static void main(String[] args) throws Exception{
//		ExecutorService es = Executors.newFixedThreadPool(5);
//		for(int i=0; i<5; i++){
//			es.execute(new TaskWithSynchronize());
//		}
//		TimeUnit.SECONDS.sleep(10);
//		es.shutdown();
		System.out.println("*********************"+Calendar.getInstance());
//		TaskWithLock tw = new TaskWithLock();
//		for(int i=0; i<5; i++){
//			es.execute(new Thread(tw));
//		}
//		TimeUnit.SECONDS.sleep(10);
//		es.shutdown();
	}
	
}

class TaskWithLock implements Runnable{
	final Lock lock = new ReentrantLock();
	
	@Override
	public void run(){
		try{
			lock.lock();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			StringBuffer sb = new StringBuffer();
			sb.append(Thread.currentThread().getName());
			sb.append("  time:"+Calendar.getInstance().get(13));
			System.out.println(sb.toString());
		}finally{
			lock.unlock();
		}
	}
}

class TaskWithSynchronize implements Runnable{
	
	@Override
	public void run(){
		synchronized(this){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			StringBuffer sb = new StringBuffer();
			sb.append(Thread.currentThread().getName());
			sb.append("  time:"+Calendar.getInstance().get(13));
			System.out.println(sb.toString());
			
		}
	}
}
