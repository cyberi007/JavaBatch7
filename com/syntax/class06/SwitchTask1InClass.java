package com.syntax.class06;

import java.util.Scanner;

public class SwitchTask1InClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your country ");
		
        String country = scan.nextLine();
        
		String language;
		
		switch (country) {
		case "Russia" :
			language = "Russian";
			break;
		case "Italy" :
			language = "Italian";
			break;
		case "Germany" :
			language = "German";
			break;
			default :
				language = "unknown";
		}
		
		System.out.println("The language you speak is " + language);
		

	}

}
