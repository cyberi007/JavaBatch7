package com.syntax.class15;

import java.util.Scanner;

public class Repltasks2 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter any programming language");
		  String language = sc.nextLine(); 
		   
//		   String l1 = sc.nextLine();
//		   String l2 = sc.nextLine();
//		   String l3 = sc.nextLine();
		   String l1 ="Java";
		   String l2 ="C";
		   String l3= "C++";
		   
		 if (language.equals(l1)) {
			 System.out.println("Java is a programming language.");
		 
		 } else if (language.equals(l2)) {
//				 String language1 = sc.nextLine(); 
				 System.out.println("C is a procedural programming language.");
			 
		 } else if (language.equals(l3)) {
//					 String language2 = sc.nextLine(); 
					 System.out.println("C++ is a middle -level programming language."); 
				 
		 
				 }else {
					 System.out.println("Doesn't match any programming language");
				 
				 }	 		 
				 }		 
}



