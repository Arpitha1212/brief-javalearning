package com.learn.Methods;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age of the candidate :");
		int age= scan.nextInt();
		boolean res=CheckEligibilty(age);
		if(res==true) {
			System.out.println("Eligible");
		}
		else {
		System.out.println("Not Eligible");
		}
	}
	static boolean CheckEligibilty(int age) {
		if(age==18 || age>=18) {
			return true;
		}
		return false;
	}

}
