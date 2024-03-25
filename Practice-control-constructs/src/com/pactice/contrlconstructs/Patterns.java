package com.pactice.contrlconstructs;

public class Patterns {
	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=7;j>=1;j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			for(int j=2;j<=7;j++) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for(int i=6;i>=1;i--) {
			for(int j=7;j>=1;j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			for(int j=1;j<=7;j++) {
					if(i>j) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			System.out.println();
		}
		System.out.println("-------------------------------------------");
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------");
		
		for(int i=6;i>=1;i--) {
			for(int j=6;j>=1;j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------");
		

		for(int i=1;i<=4;i++) {
			for(int j=4;j>=1;j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
     				System.out.print(i+" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------");
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------");
		int num=1;
		for(int i =1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
    }
	}

