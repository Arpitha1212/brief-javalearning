package com.learn.recursion;

public class FindMaximumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {34, 45, 34, 23, 56, 62, 27, 55};
		System.out.println("Maximum value: "+Search(a,0,0));

	}
	static int Search(int []a,int max,int index) {
		
		if(index==a.length) {
			return a[max];
		}
		if(a[index]>a[max]) {
			a[max]=a[index];
		}
		return Search(a,max,index+1);
}
}