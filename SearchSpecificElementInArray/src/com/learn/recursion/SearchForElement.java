package com.learn.recursion;

public class SearchForElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {5,9,7,6,3};
		int index=0;
		System.out.println(Check(arr,index));

	}
	static int target=10;
	static int Check(int[]arr,int index) {
		if(index==arr.length) {
			return -1;
		}
		if(arr[index]==target) {
			return index;
		}
		return Check(arr,index+1);
	}

}
