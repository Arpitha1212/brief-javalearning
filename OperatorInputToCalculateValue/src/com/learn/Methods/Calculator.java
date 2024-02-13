package com.learn.Methods;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1 = input.nextInt();
		System.out.println("Enter number 2");
	    int num2=input.nextInt();
	    System.out.println("Enter operator");
	    char operator=input.next().charAt(0);
	    int result;
	    if(operator=='+') {
	    	result=num1+num2;
	      }
	    else if(operator=='-') {
	    	result=num1-num2;
		}
	    else if(operator=='*') {
	    	result=num1*num2;
	   
	    }
	    else if(operator=='/')
	    {
	    	 if(num1!=0) {
	    	    	result=num1/num2;
	    }
	    	else {
	    		System.out.println("Error:Entered value is 0 division by zero is not allowed");
	    		return;
	    	}
	}
	    else {
	    	System.out.println("Error: the operator is incorrect");
	    	return;
	    }
	    System.out.println("result: "+result);
	}
}
