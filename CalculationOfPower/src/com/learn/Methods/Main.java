package com.learn.Methods;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		double num = in.nextDouble();
		System.out.println("Enter the power");
		double pow = in.nextDouble();
		double res=1;
		
		for(int i=1;i<=pow;i++){
			res=res*num;
		}
		System.out.println(res);
	}
}
