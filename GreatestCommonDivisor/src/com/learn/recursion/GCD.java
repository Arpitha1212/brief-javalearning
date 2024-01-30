package com.learn.recursion;

public class GCD {
	public static void main(String[] args) {
			System.out.println("Greater common factor value: "+num(12,18));
		}
	static int num(int num1,int num2) {
		if(num2==0) {
			return num1;
		}
		int value=num1%num2;
		return num(num2,value);
	}
}
