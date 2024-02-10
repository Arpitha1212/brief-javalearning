package com.learn.Methods;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius of the Circle");
		double r = in.nextDouble();
		double area= Math.PI*r*r;
		System.out.printf("Area of the circle is %3f",area);
	}

}
