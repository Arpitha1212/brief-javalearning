//Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers.

package com.arrays;

import java.util.Arrays;

public class MissingArrayElement {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6};
		findMissingNumber(arr);
		
	}
	static void findMissingNumber(int arr[]) {
		Arrays.sort(arr);
		int count = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != count) {
				System.out.println(count);
				break;
			}
			count++;
		}
	}
}
