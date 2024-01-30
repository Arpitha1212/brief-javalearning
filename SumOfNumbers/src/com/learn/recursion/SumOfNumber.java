package com.learn.recursion;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println("Summation of N:"+Add(n));
	}
	static int Add(int num) {
		if(num==0) {
			return 0;
		}
		return num+Add(num-1);
	}

}
