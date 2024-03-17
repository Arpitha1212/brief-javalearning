package com.DSA.CountBrackets;

public class CountBrackets {
	public static void main(String[] args) {
		String text="(())))";
		System.out.println("output:"+BracketMatch(text));
		
	}
	static int BracketMatch(String text) {
		char[] charArray = text.toCharArray();
		 int count =0;
		 int ans =0;
		 int wordlength = charArray.length;
		 
		for(int i=0;i<wordlength;i++) {
			if(charArray[i]=='(') {
				count++;
			}
			else if(charArray[i]==')') {
				count--;
			}
			
		}
		return   Math.abs(count);
	}
}
