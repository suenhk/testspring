package com.shk8000.util;

import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestConcurrencyUtil {
	
	public static void main(String[] args){
		
		CountDownLatch begin = new CountDownLatch(1);
		CountDownLatch end = new CountDownLatch(5);
		Player[] plays = new Player[5];
		
		for(int i=0; i<5; i++){
			plays[i] = new Player(i+1, begin, end);
		}
		
		ExecutorService exe = Executors.newFixedThreadPool(5);
		
		for (Player p : plays){
			exe.execute(p);
		}
		System.out.println("Race begins!");
		begin.countDown();
		
		try{
			end.await();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Race ends!");
		}
		exe.shutdown();
	}

}

class Player implements Runnable{
	private int id;
	private CountDownLatch begin;
	private CountDownLatch end;
	
	public Player(int i, CountDownLatch begin, CountDownLatch end){
		this.id = i;
		this.begin = begin;
		this.end = end;
	}
	
	@Override
	public void run(){
		try{
			System.out.println("Player"+id+"  ready");
			begin.await();
			Thread.sleep(5000);
			System.out.println("Player"+id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			end.countDown();
		}
	}
}
