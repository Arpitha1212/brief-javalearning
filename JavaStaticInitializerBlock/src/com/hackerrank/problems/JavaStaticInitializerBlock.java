package com.hackerrank.problems;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of B");
        int B = sc.nextInt();
        System.out.println("Enter the value of H");
        int H = sc.nextInt();
        int area;
        if(B>0 && H>0){
            area = B*H;
            System.out.println(area);
        }
        else{
            Exception e = new Exception();
            System.out.println(e+": Breadth and height must be positive");
        }
        
    }
}
