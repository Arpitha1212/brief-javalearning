package com.learn.Mathods;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
	public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				System.out.println("Enter the breadth of the triangle");
				double b = in.nextDouble();
				System.out.println("Enter the height of the triangle");
				double h = in.nextDouble();
				double area_of_isoscalestriangle = 0.5*b*h;
				System.out.println("Area of the triangle is "+area_of_isoscalestriangle);
	}

}
