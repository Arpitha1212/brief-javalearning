package com.learn.recursion;

public class ReversingDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(helper(1234));

	}
	static int helper(int num) {
		int digit=(int)(Math.log10(num))+1;
		return reverse(num,digit);
	}
	static int reverse(int num,int digit) {
		if(num%10==0) {
			return num;
		}
		int rem=num%10;
		return (int)((int)(rem)*(Math.pow(10, digit-1))+ reverse(num/10,digit-1));
	}
}
