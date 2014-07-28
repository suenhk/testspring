package com.shk8000.util;

public class TestChange {
	
	//这个方法一定要慎跑，因为它是遍历所有的递归情况，跑起来轻了蛋疼，严重了死机。
	public static int makeChange(int[] coins, int change){
		int minCoins = change;
		
		for (int i=0; i<coins.length; i++){
			if (coins[i] == change){
				return 1;
			}
		}
		
		for (int j=1; j<=change/2; j++){
			int thisCoins = makeChange(coins, j) + makeChange(coins, change-j);
			
			if (thisCoins<minCoins){
				minCoins = thisCoins;
			}
		}
		
		return minCoins;
	}
	
	public static void main(String[] args){
		int[] coins={1, 5, 10, 21, 25};
//		int minCoins = makeChange(coins, 63);
//		System.out.println(minCoins);
		int[] coinsUsed = new int[64];
		int[] lastCoin = new int[64];
		makeChange(coins, 5, 63, coinsUsed, lastCoin);
		for (int i=0; i<lastCoin.length; i++){
			System.out.println(coinsUsed[i]);
		}
	}
	
	public static void makeChange(int[] coins, int differentCoins, int maxChange, int[] coinsUsed, int[] lastCoin){
		coinsUsed[0] = 0;
		lastCoin[0] = 1;
		for(int cents=1; cents<=maxChange; cents++){
			int minCoins = cents;
			int newCoin = 1;
			for(int j=0; j<differentCoins; j++){
				if(coins[j]>cents){
					continue;
				}
				if (coinsUsed[cents-coins[j]]+1 < minCoins){
					minCoins=coinsUsed[cents-coins[j]]+1;
					newCoin=coins[j];
				}
			}
			coinsUsed[cents]=minCoins;
			lastCoin[cents]=newCoin;
			
		}
	}
	

}
