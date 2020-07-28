package com.syntax.class08;

import java.util.Scanner;

public class SkippNum {

	public static void main(String[] args) {
		
         // i want to print from 1 to 10
		 // but i want to skipp 5 6 7 
		
		
		//for (int i = 1; i<11; i++) {
			
		//	if (i == 5 || i == 6 || i==7) {
			//continue;
			//}
		//	System.out.println(i);
			
			//print num 1-100
			// but we want to skip num btw 35 and 55
			
			
			//for  ( int i =1; i<=100; i++) {
			
			//System.out.println(i);
			
			//if (i>=35 && i <=55) {
				//continue;
			//}
			
			//System.out.println(i);
			
			
			//print num 1-50 except those what is divisible by 3
			
			
		//for (int i = 1; i<=50; i++) {
			
		//	if (i%3==0) {
		//		continue;
				
		//	}
		//	System.out.println(i);
			
			
			//2nd task  creat a programm that will be asking user to apply for a credit card 10 times.
			//as soon as you get an "yes" from a user program should stop asking
			
			
			Scanner scan = new Scanner(System.in);
			
			for (int i = 101; i<=110; i++) {
				System.out.println("Would you like to apply for a credit card?");
		        String answer;// try with boolean
		        
			    answer = scan.next();
			
			if (answer.equals("yes")) {
				System.out.println("Congrats!You got it!");
				break;
			}
			
		}
		
		
		}
		
		
		
	}

	


	
	
	
	