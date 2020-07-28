package com.syntax.class19;

public class HWtask3 {

//	public static void main(String[] args) {
		// Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
		//Method should be available inside the class where it was declared and executed by calling it is name.
	
	public static void main(String[] args) {
		
	System.out.println(displayVowels("Welcome"));
	}
		private static String displayVowels(String value) {
			return value.replaceAll("[^aeiouyAEIOUY]", "");
			
		}
		
	}


