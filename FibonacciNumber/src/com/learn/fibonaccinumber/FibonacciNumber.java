package com.learn.fibonaccinumber;

import java.util.Scanner;

public class FibonacciNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of num");
		int num = in.nextInt();
	    int a=0;
	    int b=1;
	    
	    int count=2;
	    	while(count<=num) {
	    		int temp=b;
	    		b=a+b;
	    		a=temp;
	    		count++;
	    	 System.out.print(b+" ");
	    }
	    
	}
}
