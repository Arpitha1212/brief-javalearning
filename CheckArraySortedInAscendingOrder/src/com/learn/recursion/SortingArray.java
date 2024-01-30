package com.learn.recursion;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5};
		int index=0;
		System.out.println(Sort(arr,index)+": Array is Sorted");
	}
	static boolean Sort(int []arr,int index) {
		if(arr[index]==arr.length-1) {
			return true;
		}
		return arr[index]<arr[index+1]&&Sort(arr,index+1);
	}

}
