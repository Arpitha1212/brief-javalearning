package com.pactice.contrlconstructs;

import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int res=0;
		int count =0;
		while(num>0) {
			res= res+(num%10);
			num=num/10;
			count++;
		}
		System.out.println(res+" "+count);
	}
}
