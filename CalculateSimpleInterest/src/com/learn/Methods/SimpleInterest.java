package com.learn.Methods;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the principal");
		Double p = input.nextDouble();
		System.out.println("Enter the rate of interest");
		Double r= input.nextDouble();
		System.out.println("Enter the time take t ");
		Double t = input.nextDouble();
		Double  si;
		si=(p*t*r)/100;
		System.out.printf("Simple interest: %2f",si);
	}

}
