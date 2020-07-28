package com.syntax.class05;

import java.util.Scanner;

public class HW3temp {

	public static void main(String[] args) {
		// Creat a JAva program that will ask user to input city and temperature.
		//Your program should convert Fahrenheit into celsius and print "the temperature is the city__is__".

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the city.");
		
		String city = scan.nextLine();
		System.out.println("Please enter the temp in F");
		
		int tempF = scan.nextInt();
		int tempC = (tempF-32) * 5/9;
		System.out.println("The temperature in celsius is the city " + " is " + tempC);
		
	}

}
