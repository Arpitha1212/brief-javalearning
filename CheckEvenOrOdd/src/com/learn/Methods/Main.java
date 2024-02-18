package com.learn.Methods;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int input= in.nextInt();
		Check(input); 
	}
	static void Check(int input) {
		if(input%2==0) {
			System.out.println("Even number...");
		}
		else {
			System.out.println("Odd number...");
		}
	}
}
