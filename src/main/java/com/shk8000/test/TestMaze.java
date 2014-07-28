package com.shk8000.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.joran.spi.JoranException;



public class TestMaze {
	
	
	
	private static int[][] book = new int[6][5];
	private static int[][] a = new int[6][5];
	private static int n=5, m=4;//迷宫的行和列
	private static int[][] next = {{0,1},{1,0},{0,-1},{-1,0}};
	private static int k = 3;//这个3是next数组的个数
	private static int tx=0, ty=0, p=4, q=3;
	private static int head, tail;
	private static node[] que = new node[2500];
	
	static{
//		logger.warn("ffffff");
		//初始化迷宫
		for (int i=1; i<=n; i++){
			for (int j=1; j<=m; j++){
				if ((i==1&&j==3) || (i==3&&j==3) || (i==4&&j==2) || (i==5&&j==4)){
					a[i][j]=1;
				}else{
					a[i][j]=0;
				}
				
			}
		}
	}
	private static Logger logger = LoggerFactory.getLogger(TestMaze.class);
	
	public static void main(String[] args){
		logger.info("ffffff");
		logger.warn("ffffff");
		
//		book[1][1]=1;
//		dfs(1,1,0);
		wfs();
	}
	
	public static void dfs(int x, int y, int step){
		
		for(int i=0; i<=k; i++){
			tx = x + next[i][0];
			ty = y + next[i][1];
			if (tx<1 || tx>n || ty<1 || ty>m){
				continue;
			}
			if (a[tx][ty]==0 && book[tx][ty]==0){
				book[tx][ty]=1;
				dfs(tx, ty, step+1);
				book[tx][ty]=0;
			}
		}
		
		int min=999999;
		if (x==p && y==q){
			if (step<min){
				min = step;
			}
			System.out.println(step+"  <---->  "+min);
			return;
		}
	}
	
	
	public static void wfs(){
		head=1;
		tail=1;
		node nd = new node(1, 1, 0, 0);
		que[tail] = nd;
		System.out.println(que[tail].x+"  "+nd.x);
		tail++;
		book[1][1]=1;
		int flag=0;
		
		
		while(head < tail){
			for(int i=0; i<=k; i++){
				tx = que[head].x + next[i][0];
				ty = que[head].y + next[i][1];
				if (tx<1 || tx>n || ty<1 || ty>m){
					continue;
				}
				if (a[tx][ty]==0 && book[tx][ty]==0){
					book[tx][ty]=1;
					node nde = new node(tx, ty, que[head].step+1, head);
					que[tail] = nde;
					tail++;
				}
				if (tx==p && ty==q){
					flag=1;
					break;
				}
			}
			if (flag==1){
				break;
			}
			head++;
		}
		System.out.println(que[tail-1].step);
	}
	
	private static class node{
		int x;
		int y;
		int step;
		int f;
		public node(int x, int y, int step, int f){
			this.x = x;
			this.y = y;
			this.f = f;
			this.step = step;
		}
	}

}
