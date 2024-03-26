package com.arrays;

import java.util.Scanner;

public class RowValuestoColumns {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the First array");
		int size1 = sc.nextInt();		
		System.out.println("Enter the size of the second array");
		int size2 =sc.nextInt();
		
		int arr[][] = new int[size1][size2];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Bothside diagonal");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if((i+j)==(arr.length-1) || (i==j)) {
					System.out.print(arr[i][j]+" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Diagonal");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if((i+j)==(arr.length-1) ) {
					System.out.print(arr[i][j]+" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Main Diagonal");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j ) {
					System.out.print(arr[i][j]+" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("L shape");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==arr.length-1 || j == 0 ) {
					System.out.print(arr[i][j]+" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
