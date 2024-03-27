package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Addarrayandstring {
	public static void main(String[] args) {
		int arr[]= {1,5,8};
		int k=25;
		List<Integer> res = addition(arr,k);
		System.out.println(res);
		
	}
	static List<Integer> addition(int arr[],int k){
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum*10+arr[i];
		}
		sum+=k;
		List<Integer> b = new ArrayList<Integer>();

     	int length = (int)Math.log10(sum)+1;
	
		for(int i=0;i<length;i++) {
		   b.add(sum%10);
			sum/=10;
		}
		Collections.reverse(b);
		return b;
	}
}
