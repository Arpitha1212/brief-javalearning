//8. Write a Java program that requires the user to enter a single character from the alphabet. 
//Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), 
//or is a string of length > 1, print an error message.
////
//Test Data
//Input an alphabet: p
//Expected Output :
//Input letter is Consonant
package com.pactice.contrlconstructs;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Enter the alphabet");
		char ch = str.charAt(0);
		if(str.length()>1) {
			System.out.println("Error Message");
		}else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
			System.out.println("Vowels");
		}else if(str.charAt(0)>=65 && str.charAt(0)<=90||str.charAt(0)>=97 && str.charAt(0)<=122) {
			System.out.println("Error Message");
		}
		else {
			System.out.println("consonents");
		}

	}

}
