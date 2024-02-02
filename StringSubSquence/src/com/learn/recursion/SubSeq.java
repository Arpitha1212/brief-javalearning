package com.learn.recursion;

public class SubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub("","abc");

	}
	static void sub(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch=up.charAt(0);
		sub(p+ch,up.substring(1));
		sub(p,up.substring(1));
	}

}
