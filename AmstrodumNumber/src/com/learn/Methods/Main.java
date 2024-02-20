package com.learn.Methods;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number to check amstrodum: ");
	   int input = in.nextInt();
	   System.out.println(isAmstrom(input));
	   for(int i=100;i<=1000;i++) {
		   if(isAmstrom(i)) {
			   System.out.print(i+" ");
		   }
	   }
	
}
	static boolean isAmstrom(int input) {
		int Original=input;
		int sum=0;
		while(input>0) {
			int rem=input%10;
			input= input/10;
			sum=sum+rem*rem*rem;
		}
		return sum==Original;
	}
}
