package com.learn.recursion;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//alter within the array.
		int []arr= {5,3,8,9,4};
		Sort(arr,arr.length-1,0);
		System.out.print("Sorted array: "+Arrays.toString(arr));
	}
		static void Sort(int []arr,int row ,int col) {
			if(row==0) {
				return;
			}
			if(col<row) {
				if(arr[col]>arr[col+1])
				{
					int temp=arr[col];
					arr[col]=arr[col+1];
					arr[col+1]=temp;
				}
				 Sort(arr,row,col+1);
			}
				else {
					 Sort(arr,row-1,0);
				}
		}
	}


