package com.learn.Method;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Indian INR");
			int inr = input.nextInt();
			double usd = 0.012;
			System.out.println("USD :" + usd * inr);
	}

}
