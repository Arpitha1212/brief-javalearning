package com.learn.recursion;

public class Skip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p="";
		String up="bacchapi";
		check(p,up);
	}
	static void check(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch=up.charAt(0);
		
		if(ch=='a') {
			check(p,up.substring(1));
		}
		else {
			check(p+ch,up.substring(1));
		}
	}
}
