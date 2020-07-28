package com.syntax.class06;

import java.util.Scanner;

public class CompareNumUsingnestedIf {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter first num");
		double a = scan.nextDouble();
		
		System.out.println("Please enter sec num");
		double b = scan.nextDouble();
		
		
		System.out.println("Please enter third num");
		double c = scan.nextDouble();
		
		double largest;
		
		if (a > b) {
		// here a is already larger then b
			if (a > c) {
				// a is the largest
				largest = a;
			
			
				}else {
					//b is larger than a, but c is larger than b
					largest = c;
				}
			}
				
				System.out.println("Largest num is" + largest);
				
			}
		
	}
	}

	}
