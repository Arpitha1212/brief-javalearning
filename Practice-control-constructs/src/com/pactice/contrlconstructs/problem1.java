package com.pactice.contrlconstructs;
//Write a Java program to solve quadratic equations (use if, else if and else).
//
//Test Data
//Input a: 1
//Input b: 5
//Input c: 1
//
//output:
//	Enter the value of a
//	1
//	Enter the value of b
//
//	5
//	Enter the value of c
//	1
//	-0.20871215252208009
//	-4.7912878474779195

import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a = sc.nextDouble();
		System.out.println("Enter the value of b");
		double b = sc.nextDouble();
		System.out.println("Enter the value of c");
		double c = sc.nextDouble();
		
		
		double result = (b*b) - (4*a*c);
		
		if(result > 0) {
			double root1 = (-b+Math.sqrt(result))/(2*a);
			double root2 = (-b-Math.sqrt(result))/(2*a);
			System.out.println(root1);
			System.out.println(root2);
		}
		else if(result == 0){
			double eq = -(b/2*a);
			System.out.println(eq);
		}else {
			System.out.println("Number is imaginary");
		}	
		
	}
	

}
