package com.syntax.class05;

import java.util.Scanner;

public class EqualsinString {

	public static void main(String[] args) {

//compare 2 strings we use Equals

//		String day2 = "Tuesday";
//
//		if (day2=="Tuesday" || day2=="Thursday") {
//			System.out.println("SDLC class");
//		} else if (day2.equals("Saturday") || day2.equals("Sunday")) {
//			System.out.println("Java class");
			
			
			//TASK
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your height");
			
			int H = scan.nextInt();
			
			if (H<=60) {
				System.out.println("He is short");
				
			}else if (H>=60 && H<=72) {
				System.out.println("Medium");
			}else if (H>=72) {
				System.out.println("Tall");
			
			
			
			
		}

	}

}
