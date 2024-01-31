package com.learn.recursion;

public class ProductOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {1,3,5,7};
		 int index=0;
		 System.out.println("Product of array: "+Product(array,index,1));
	}
	static int Product(int[]arr,int index,int product) {
		if(index==arr.length) {
			return product;
		}
		product=product*arr[index];
		return Product(arr,index+1,product);
	}
}
