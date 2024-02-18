package com.learn.Methods;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number from 1-7: ");
		int day = scan.nextInt();			//  Enhanced method of switch
											//-------------------------------------
		switch(day) {						// switch(day){
		case 1:System.out.println("weekday");//case 1,2,3,4,5->System.out.println(weekdays);
		break;								//case 6,7->System.out.println(weekend);
		case 2:System.out.println("weekday");//}-------------------------------------------
		break;
		case 3:System.out.println("weekday");
		break;
		case 4:System.out.println("weekday");
		break;
		case 5:System.out.println("weekday");
		break;
		case 6:System.out.println("weekend");
		break;
		case 7:System.out.println("weekend");
		break;
		default:
			System.out.println("Entered invalid number ");
		}
	}

}
