package com.arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		int arr[] = {5,8,6,7,3,4,2,1};
		int res[] = sorting(arr);
		System.out.println(Arrays.toString(res));
	}
	static int[] sorting(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
     				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
}
