package com.syntax.class04;

public class LogicalOperators {

	public static void main(String[] args) {
		
		
		boolean haveMoney=false;
		boolean restaurantNear=false;
		
		if (haveMoney && restaurantNear) {//to work with this && operator both conditions should be true
			System.out.println("I will eat outside");
			
		} else {
			System.out.println("Both conditions were not true");
			
		System.out.println("******");
		
		boolean atmisOpen=false;
		boolean cashiarIsOpen=false;
		
		if (atmisOpen || cashiarIsOpen ) { // to work operator one condition should be true ||
			System.out.println("I can get cash");
		}else {
			System.out.println("Neither one was true");
		}
		
		System.out.println("**********");
		
		int num1=3;
		int num2=5;
		
		
		
		//String statement="The total of num1 and num2 is: "
		
		System.out.println("The total is: "+(num1 + num2));
		
		
		
		
		}
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


