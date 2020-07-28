package com.syntax.class05;

import java.util.Scanner;

public class Hw1NestedIf {

	public static void main(String[] args) {
		//Create a Java program that will ask if user has a credit card or not.
		//If user doesn't have a credit card then offer him.
		//If he has one ask what is the balance on this card?
		//If balance is larger than 1000, tell him to pay off immediately.
		//Otherwise you can tell him he can spend more money.

		Scanner scan = new Scanner(System.in);
		
		boolean cc;
		System.out.println("Do you have a cc?");//true or false
		
		cc=scan.nextBoolean();
		
		if (cc){
			System.out.println("What is your cc balance please?");
		
		double balance = scan.nextDouble();
		
		 if(balance>1000) {
			 System.out.println("Pay off immediately");
		 } else {	 
			System.out.println("You can spend more");
		 }	
		 
	     } else {
			
		System.out.println("Do you want to apply for cc?");
	}
		
		
		
		
		
		}
		
	}


