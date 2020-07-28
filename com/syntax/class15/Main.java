package com.syntax.class15;

import java.util.Scanner;

public class Main {
	
	
	
	
	public static void main(String[] args) {
		
//		String name="Timmy";
//		int size = name.length();
//	    System.out.println("Thare are " + size + " characters in this String.");
//		
//		String s1="hello";
//	    boolean isEmpty= s1.isEmpty();
//	    System.out.println(isEmpty);
//
//	    String s2="";
//	    boolean isEmpty1= s2.isEmpty();
//	    System.out.println(isEmpty1);
		
		
//		String str = "abracadabra alakazam";
//	    String target1 = "dab";
//	    String target2 = "ABRA";
//	    
//	    System.out.println( str.indexOf("c"));
//	    System.out.println(str.indexOf(" "));
//	    System.out.println(str.indexOf(target1));
//	    System.out.println(str.indexOf(target2));
		
		Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter the browser name to proceed further with execution");
	    String browser = sc.nextLine(); 
	    String message;
	    
	    switch (browser.toLowerCase()) {

			case "chrome":
				message = "Proceed with Chrome browser";
				break;
			case "firefox":
				message = "Proceed with Firefox browser";
				break;
			case "ie":
				message = "Proceed with IE browser";
				break;
			default:
				message= "Invalid browser";
			}

			System.out.println(message);
	    
	    
	    
	    
	    
        
	}	
}		
		
		
		
		
		
		
		
		
		
	

