package com.learn.Methods;

import java.util.Scanner;

public class GradeDisplay {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the marks ");
		int marks = in.nextInt();
		GradeCheck(marks);

	}

	static void GradeCheck(int marks) {
		if (marks >= 91 && marks <= 100) {
			System.out.println("Grade :AA");
		}
		if (marks >= 81 && marks <= 90) {
			System.out.println("Grade :AB");
		} else if (marks >= 71 && marks <= 80) {
			System.out.println("Grade :BB");
		} else if (marks >= 61 && marks <= 70) {
			System.out.println("Grade :BC");
		} else if (marks >= 51 && marks <= 60) {
			System.out.println("Grade :CD");
		} else if (marks >= 41 && marks <= 50) {
			System.out.println("Grade :DD");
		} else if (marks <= 40) {
			System.out.println("Grade: Fail");
		}
	}
}
