package com.arrays;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the elements of the array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the key to search");
		int key = sc.nextInt();
		
		int res = search(arr,key);
		if(res<0) {
			System.out.println("Key not found");
		}else {
			System.out.println("key is:"+res);
		}
		
		System.out.println(res);
	}
		static int search(int arr[],int key) {
			int start = 0;
			int end = arr.length-1;
			
			while(start<=end) {
				int mid = start+(end-start)/2;
				
				if(key>arr[mid]) {
					start = mid+1;
				}else if(key<arr[mid]) {
					end =mid-1;
				}else if(key == arr[mid]) {
					return mid;
				}
			}
		return -1;
	}

}
