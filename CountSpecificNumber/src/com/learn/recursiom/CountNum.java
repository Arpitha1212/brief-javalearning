package com.learn.recursiom;

public class CountNum {
	public static void main(String[] args) {
		System.out.println("1 Repeated in the given number: "+helper(1561145));
	}
	static int helper(int num) {
		int count=0;
		return count(num,count);
		
	}
	static int count(int num,int count) {
		if(num%10==0) {
			return count;
		}
		int rem=num%10;
		if(rem==1) {
			return count(num/10,count+1);
		}
		return count(num/10,count);
	}
}
