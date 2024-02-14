package com.learn.Methods;

import java.util.Scanner;

public class FactorialValueOfTheNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int input = in.nextInt();
		if(input<0) {
			System.out.println("Factorial can not be defined for negative number");
		}
		else {
			int fact=CalculateFactorail(input);
		System.out.println("Factorial value :"+fact);
		}
	}
	static int CalculateFactorail(int input) {
	int f=1;
		for(int i=1;i<=input;i++) {
				f=f*i;
			}
			return f;
		}
}
