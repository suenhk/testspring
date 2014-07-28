package com.shk8000.util;

public class TestSort {
	
	public static void main(String[] args){
		int[] a = {4,2,1,6,7,32,98,56};
//		int[] b = quickSort(a,0,a.length-1);
//		for (int i=0; i<b.length; i++){
//			System.out.println(b[i]);
//		}
		
//		heapSort(a, a.length);
//		for (int i=0; i<a.length; i++){
//			System.out.println(a[i]);
//		}
		
		mergeSort(a, 0, a.length-1);
		for (int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		
		
		int i = 8;
		int j = 15;
		System.out.println(i&j);
		
		int n = Integer.MAX_VALUE;
		int m = 1;
		System.out.println(n*m);
		System.out.println(n+1);
	}
	
	public static int[] quickSort(int[] a, int low, int high){
		if(low < high){
			int pivot = a[low];
			int i = low;
			int j = high;
			while(i<j){
				while(i<j && a[j]>=pivot)
					j--;
				a[i]=a[j];
				while(i<j && a[i]<=pivot)
					i++;
				a[j]=a[i];
			}
			a[i] = pivot;
			quickSort(a, low, i-1);
			quickSort(a, i+1, high);
		}
		return a;
	}
	
	public static void heapSort(int[] data, int nlen){
		int i;
		int nTemp;
		for (i=nlen/2-1;i>=0;i--){
			heapAdjust(data, i, nlen);
		}
		for (i=nlen-1;i>0;i--){
			nTemp = data[0];
			data[0] = data[i];
			data[i] = nTemp;
			heapAdjust(data, 0, i);
		}
	}
	
	private static void heapAdjust(int[] data, int nstart, int nlen){
		int nMaxChild = 0;
		int Temp;
		while ((2*nstart+1) < nlen){
			nMaxChild = 2*nstart+1;
			if((2*nstart+2)<nlen){
				if (data[2*nstart+1] < data[2*nstart+2]){
					nMaxChild = 2*nstart+2;
				}
			}
			if (data[nstart]<data[nMaxChild]){
				Temp = data[nstart];
				data[nstart] = data[nMaxChild];
				data[nMaxChild] = Temp;
				nstart = nMaxChild;
			}else{
				break;
			}
		}
	}
	
	public static void mergeSort(int[] a, int low, int high){
		if (low >= high) return;
		else{
			int mid = (low+high)/2;
			mergeSort(a, low, mid);
			mergeSort(a, mid+1, high);
			merge(a, low, mid, high);
		}
	}
	
	private static void merge(int[] a, int low, int mid, int high){
		int i=low;
		int j=mid+1;
		int k=0;
		int[] temp = new int[high-low+1];
		while(i<=mid && j<=high){
			if(a[i]<=a[j]){
				temp[k++] = a[i++];
			}else{
				temp[k++] = a[j++];
			}
		}
		while (i<=mid){
			temp[k++] = a[i++];
		}
		while (j<=high){
			temp[k++] = a[j++];
		}
		for (i=0; i<=high-low; ++i){
			a[low+i] = temp[i];
		}
	}

}
