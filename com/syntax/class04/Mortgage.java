package com.syntax.class04;

public class Mortgage {

	public static void main(String[] args) {
		
		double rate = 4.5;
		int price = 200000;
		
		if (rate > 4.5) {
			System.out.println("Will not buy a house");
		}else {
			System.out.println("User buy a house");
			if (price > 200000) {
				System.out.println("User take a loan");
			}else {
				System.out.println("Will pay cash");
			}
		}
		

	}

}
