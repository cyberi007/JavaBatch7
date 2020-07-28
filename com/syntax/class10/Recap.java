package com.syntax.class10;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		// we can read from Scanner
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many floors does your hotel have?");
		int floors=scan.nextInt();
		
		System.out.println("How many rooms in each floor?");
		int rooms=scan.nextInt();
	
		for (int i = 1;i<=floors; i++) { // rows input from Scanner

			for (int j =1;j<=rooms;j++) { // columns input from Scanner
			
			System.out.print(i+ "." + j + " ");
			}
          System.out.println();

	}
	}
}

