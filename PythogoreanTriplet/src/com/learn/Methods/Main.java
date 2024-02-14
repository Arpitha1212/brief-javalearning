package com.learn.Methods;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number 1 ");
		double num1 = scan.nextDouble();
		System.out.print("Enter number2 ");
		double num2 = scan.nextDouble();
		CheckTriplet(num1, num2);
	}

	static void CheckTriplet(double num1, double num2) {
		double sqrt = num1 * num1 + num2 * num2;
		double res = Math.sqrt(sqrt);
		System.out.println(sqrt == res * res);

	}

}
