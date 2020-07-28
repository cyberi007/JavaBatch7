package com.syntax.class06;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
	
     Scanner scan = new Scanner(System.in);
	
		System.out.println("Please enter your birth month: ");
		
		String month = scan.next();
		
		String season = "Unknown";	
		
		 if (month.contentEquals("December") || month.contentEquals("January") || month.contentEquals("February")  ) {
			 season = "Winter";
			 
		 } else if (month.contentEquals("March") || month.contentEquals("April") || month.contentEquals("May")  ) {
				     season = "Spring"; 
			 
		 } else if (month.contentEquals("June") || month.contentEquals("July") || month.contentEquals("August")  ) {
					 season = "Summer"; 
			 
		 } else if (month.contentEquals("Sept") || month.contentEquals("Oct") || month.contentEquals("Nov")  ) {
			         season = "Fall"; 
			        
			
			 
		 }
	
     
		 System.out.println("You were born in " + season);
		 
		 
     
     
     
     
     
	}   
     
		
		
	}


