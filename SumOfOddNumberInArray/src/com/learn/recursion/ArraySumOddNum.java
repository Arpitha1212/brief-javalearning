package com.learn.recursion;

public class ArraySumOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Addition of odd number: "+AddArray(arr,0));
	}
	static int AddArray(int[]arr,int index) {
		if(index>=arr.length-1) {
			return 0;
		}
		int sum=0;
			if(arr[index]%2!=0) {
				return arr[index]+AddArray(arr,index+1);
			}
		return AddArray(arr,index+1);
	}

}
