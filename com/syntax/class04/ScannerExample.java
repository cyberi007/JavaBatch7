package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
         //Capture the name from the user and print
		 //Your name is ____
		
		//Ask the user to enter the age and print
		//Your name is___and age is___
		
		//1.We bring the scanner Class to our program
		// System.in-->read from keyboard/console
		Scanner input = new Scanner(System.in);
		
		// we are instructing the user what to enter
		System.out.println("Please enter your full name!");
		// We are capturing the whole line into a text variable
		
		String name = input.nextLine();
		System.out.println("Your name is" + name);
		
		//We are capruting the text as a double
		//If it is not double , then an error/exception will be printed
		System.out.println("Please enter your age as double");
		double albanianAge = input.nextDouble();
		System.out.println("Your name is + name +  and age is " + albanianAge);
		
		
		
		
		
		
		
	}

}
