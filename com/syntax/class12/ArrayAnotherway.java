package com.syntax.class12;

public class ArrayAnotherway {

	public static void main(String[] args) {
		//we created an Array and stored the initial values
          String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursda", "Friday"};
		
		//let us print the element with index 3
		System.out.println(weekdays[3]);
		
		weekdays[3] = "Thursday";//re-assigning
		System.out.println(weekdays[3]);
		
		//we cant add the elements to array
		//weekday[5] = "Saturday";
		
		//Add more
		double[] balances = {10000, 23.50, 5540 };
		
		System.out.println("total money is:" + (balances[0] + balances[1] + balances[2] ));
		
		//2nd way
		
		double total = balances[0] + balances[1] + balances[2];
		System.out.println("total is: " + total);
		
		//casting into int
		int total1 = (int) (balances[0] + balances[1] + balances[2]);
		System.out.println("total1 is: " + total1);
		
		
	}

}
