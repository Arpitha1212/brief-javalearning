package com.learn.recursion;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {10,8,9,3,5,4};
		arr=mergeSort(arr);
		System.out.println("Sorted array: "+Arrays.toString(arr));
	}
	static int[] mergeSort(int[]arr) {
		if(arr.length==1) {
			return arr;
		}
		
		int mid=(arr.length)/2;
		
		int[]left=mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[]right=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return mix(left,right);
	}
	static int[] mix(int[]first,int[]second) {
		
		int[]mix= new int[first.length+second.length];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<first.length && j<second.length) {
			if(first[i]<second[j]) {
				mix[k]=first[i];
				i++;
			}
			else {
				mix[k]=second[j];
				j++;
			}
			k++;
		}
		
	while(i<first.length) {
		mix[k]=first[i];
		i++;
		k++;
	}
	while(j<second.length) {
		mix[k]=second[j];
		j++;
		k++;
	}
	return mix;
	}
}
