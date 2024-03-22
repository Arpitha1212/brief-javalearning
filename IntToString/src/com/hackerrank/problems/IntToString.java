package com.hackerrank.problems;

import java.util.Scanner;

public class IntToString {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check range from -100 to 100");
        int n = sc.nextInt();
        
        
        if(n>=-100 && n<=100){
            System.out.println("Good job");
        }
        
    }
}
