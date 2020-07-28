package com.syntax.class06;

import java.util.Scanner;

public class HomeWork1WithSwitch {

	public static void main(String[] args) {
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Please enter your birth month: ");
		
		String month = scan.next();
		
		String season = "Unknown";	
		
		switch(month) {
		
		case "December":	
		case "january":
		case "February":
			season = "Winter";
			break;
			
		case "March":
		case "April":
		case "May":
			season = "Spring";
			break;
			
		case "June":
		case "July":
		case "August":
			season = "Summer";
			break;
			
		case "September":
		case "October":
		case "November":
			season = "Fall";
			break;
			default:
				season = "Unknown";
		}
			
		System.out.println("You were born in " + season);	
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		

	}


