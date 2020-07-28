package com.syntax.class08;

import java.util.Scanner;

public class LotteryLoop {

	public static void main(String[] args) {
		
		// about a lottery game in slack

		
		
		Scanner scan = new Scanner(System.in);
	
	int lucky = 17;
	int num;
		//if i use while loop i have to ask 2 times
		do {
		System.out.println("Please enter a number from 1-20:");
		num = scan.nextInt();
		}while (num != lucky);
		
		System.out.println("Congrats! You won!");
			
			//while loop
			
//			int lucky = 17;
//			int num;
//			
//			while (num != lucky) {
//				System.out.println("Please enter a number from 1-20:");
//				num = scan.nextInt();
			}
			
			
			
			
}		
			
			
		
		
		
		


