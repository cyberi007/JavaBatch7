package com.syntax.class05;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		// We have 7 days of week
		// If day is 2, 4 ---> SDLC class
		// If day is 6,7 ---> Java class
		// If day is 1,5 ---> No class
		// If day is 3--> Review class

		int day = 3;
		if (day == 2 || day == 4) {
			System.out.println("SDLC class");

		} else if (day == 6 || day == 7) {
			System.out.println("Java class");

		} else if (day == 1 || day == 5) {
			System.out.println("No class");

		} else if (day == 3) {

			System.out.println("Review class");
		}

	}

}
