package com.shk8000.test;

public class TestRecursion {
	
	private static int[] a = new int[10];
	private static int[] book = new int[10];
	
	public static void dfs(int step){
		
		int n = 3;
		
		if (step==n+1){
			for (int i=1; i<=n; i++){
				System.out.print(a[i]);
			}
			System.out.println();
			return;
		}
		
		for (int i=1; i<=n; i++){
//			System.out.println(book[i]);
			if (book[i] == 0){
				a[step] = i;
				book[i] = 1;
				dfs(step+1);
				book[i] = 0;
			}
		}
//		return;
	}
	
	public static void add(int step){
		int n=9;
		
		if(step==n+1){
			if (a[1]*100+a[2]*10+a[3]+a[4]*100+a[5]*10+a[6] == a[7]*100+a[8]*10+a[9]){
//				System.out.print("@@@@@@@@@@@@@@@@@@@@@@@@");
				for (int i=1; i<=n; i++){
					System.out.print(a[i]);
					if (i==3){
						System.out.print(" + ");
					}else if(i==6){
						System.out.print(" = ");
					}
				}
				System.out.println();
			}
			
			return;
		}
		
		for(int i=1; i<=n; i++){
			if (book[i] == 0){
				a[step] = i;
				book[i] = 1;
				add(step+1);
				book[i] = 0;
			}
		}
	}
	
	public static void main(String[] args){
		add(1);
	}

}
