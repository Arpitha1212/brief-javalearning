package com.learn.recursion;

public class ExponentialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exponentail value: "+helper(3.5,4));

	}
	static double helper(double base,int expo) {
		if(expo==0) {
			return 1;
		}
	
		return base*helper(base,expo-1);
	}

}
