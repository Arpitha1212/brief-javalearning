//Write a java program to count the number of zeros in the given digit.
package _DSA_Learn_proramming_Recursion;

public class CountZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2030580;
		System.out.println("Number of Zero's: "+Count(num));
	}
	static int Count(int num) {
		int value=0;
		return helper(num,value);
	}
	static int helper(int num,int c) {
		if(num==0) {
			return c;
		}
		int rem=num%10;
		if(rem==0) {
			return helper(num/10,c+1);
		}
		
			return helper(num/10,c);
		}
	}
	
/*
 * input:num=2030580
 * Output:Number of Zero's: 3

 */
