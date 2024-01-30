package com.learn.recursion;

public class Palindrome {
	public static void main(String[] args) {
		int num=12321;
		System.out.println("The given Number is palindrome: "+helper(num));
	}
	static boolean helper(int num) {
		String value=String.valueOf(num);
		return Palin(value,0,value.length()-1);
	}
	static boolean Palin(String value,int s,int e) {
		if(s>=e) {
			return true;
		}
		if(value.charAt(s)!=value.charAt(e)) {
			return false;
		}
		return Palin(value,s+1,e-1);
	}
}
