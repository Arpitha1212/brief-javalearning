package QuickSort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inplace sorting for elements
		int[]arr= {5,4,3,2,1};
		sort(arr,0,arr.length-1);
		System.out.println("Sorted Array: "+Arrays.toString(arr));
	}
	static void sort(int []arr,int low,int high) {
		int s=low;
		int e=high;
		
		int mid=(s)+(e-s)/2;
		int pivot=mid;
		
		if(low>=high) {
			return;
		}
		
		while(s<=e) {
			if(arr[s]<arr[mid]) {
				s++; // until any violation shift the s to next elements in the array.
			} 
			
			if(arr[e]>arr[mid]) {
				e--;
			}
			if(s<=e) {// if in case any condition above mentioned fails the swap the elements.
				int swap=arr[s];
				arr[s]=arr[e];
				arr[e]=swap;
				s++;
				e--;
			}
		}
		sort(arr,low,e);
		sort(arr,s,high);
	}
}
