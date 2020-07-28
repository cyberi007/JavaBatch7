package com.syntax.class15;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		//Write a program that reads two people's first names and if they expecting boy or girl?
		//Based on the input suggests a name for a baby:
		
          Scanner inp=new Scanner (System.in);
          
//		  System.out.println("Please enter your father's name: ");
//		  String name1=scan.nextLine();
//		  
//		  System.out.println("Please enter your mather's name: ");
//		 String name2=scan.nextLine();
//		 
//		 
//		 System.out.println("Is it boy or girl?"); 
//		 String gender = scan.nextLine();
//		 
//		 String babyName;
//		
//		 if(gender.toLowerCase().equals("boy")) {
//		 System.out.println("Congratulation, its a boy!");
//	 	 babyName = name1.substring(0, name1.length()/2) + name2.substring(name2.length()/2);
//		
//		 }else if(gender.equalsIgnoreCase("girl")) {
//			 System.out.println("Congratulation, its a girl!");
//			 babyName=name2.substring(0, name2.length()/2) + name1.substring(name1.length()/2);
//			 
//		 }else {
//			 babyName="unknown";
//		 }
//		System.out.println(babyName.toUpperCase());
//		scan.close();
		
		//int lengthOfNewDay=day.substring(3).toUpperCase().length();
		
		
		System.out.println("--------------Reverse a String------------");
		
//		String day="Sunday";
//		
//		for(int i = day.length()-1;i>=0;i--) {
//			char letters=day.charAt(i);
//			System.out.println(letters);
		
//			String day="Sunday";
//			
//			for(int i = 0;i<=day.length();i++) {
//				char letters=day.charAt(i);
//				System.out.println(letters);
			
		System.out.print("In:");
	    String word = inp.nextLine();
	    
	    //write your code below
	   for(int i=0; i<=word.length()-1; i++)
		  
	   System.out.println(word.charAt(i));
			
			
			
			
		}
		
		
		
		
		
	}


