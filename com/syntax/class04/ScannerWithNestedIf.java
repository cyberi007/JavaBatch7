package com.syntax.class04;

import java.util.Scanner;

public class ScannerWithNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Is the checkbox Displayed?");
	
		Scanner scan = new Scanner(System.in);
	
		boolean isDisplayed=scan.nextBoolean();
		
		if (isDisplayed) {
			
			System.out.println("Is the checkbox selected?");
			boolean isSelected=scan.nextBoolean();
			
			System.out.println("Checkbox is displayed");
			
		if (isSelected) {
			System.out.println("Checkbox is already selected");
			
			}else {
				System.out.println("It is not selected.You can click on it");
			}
			
		    }else {
			System.out.println("Checkbox is not displayed");
			
			
			System.out.println("**************");
			
			System.out.println("Input the boolean value");
			  boolean inputIstrue = scan.nextBoolean();
			  
			  if (inputIstrue) {
			   System.out.println("The value is true");
			
		}
		
		
	}
		
	}

}
