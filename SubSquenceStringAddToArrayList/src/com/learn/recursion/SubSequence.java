package com.learn.recursion;

import java.util.ArrayList;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		System.out.println("ArrayList of subsequence: "+add("",str));
	}
	static ArrayList<String> add(String p,String up){
		 if(up.isEmpty()) {
			 ArrayList<String> list= new ArrayList<>();
			 list.add(p);
			 return list;
		 }
		 char ch = up.charAt(0);
		
		 ArrayList<String> left = add(p+ch ,up.substring(1));// add condition.
		 
		 ArrayList<String> right = add(p ,up.substring(1));// ignore condition.
		 
		 left.addAll(right);
		 return left;
	}
}
