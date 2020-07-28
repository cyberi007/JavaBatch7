package com.syntax.class09;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		//
		// 
		Scanner scan=new Scanner(System.in);
		
		int start; // i dont need to initialize because i will read from input(console)
		int end;
		int sumOdd=0; 
		int sumEven=0;
		
		System.out.println("Please enter the starting number:");
		 start = scan.nextInt();
		
		System.out.println("Please enter the ending number:");
		 end = scan.nextInt();
		 
		               //i<end + 1
		for(int i=start; i<=end; i++) {
		
			if(i%2==0) {//even number
				
				sumEven +=i;//}else {
				            //sumOdd 
			                //total +=i;
			} else { //odd number
				sumOdd +=i;
				
			// 1st way ; sum of all numbers : total += i;	
			// 2nd way ; 	
				//---- end*(end+1)/2;
			}
		}		
		System.out.println("Sum of even numbers is " + sumEven);
		System.out.println("Sum of odd numbers is " + sumOdd);
		// 2nd way ; 
		int total = sumEven + sumOdd;
		System.out.println("The Sum of all numbers is " + total);
	}
		
		
	}
	








