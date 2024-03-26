package com.arrays;

import java.util.Scanner;

public class SumOfArraysElementsToThirdArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the First array");
		int size1 = sc.nextInt();
		System.out.println("Enter the size of the second array");
		int size2 = sc.nextInt();

		int arr[] = new int[size1];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		int arr1[]= new int[size2];
		for (int i = 0; i < arr.length; i++) {
			arr1[i]= sc.nextInt();
		}
		int arr3[]= new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			arr3[i]=arr[i]+arr1[i];
			System.out.print(arr3[i]+" ");
		}
		
	}
}
