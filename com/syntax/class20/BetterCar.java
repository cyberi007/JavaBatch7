package com.syntax.class20;

public class BetterCar {

	 public static String make="BMW";
     protected String model,color;
     int year;
     private double price;
	
	
     public void displayInfo() {
 		System.out.println("We build "+color+" "+year+" "+make+" "+model+" for price = $"+price);
 	}
	
     //we crate a constructor to initialize our variables
     
	BetterCar(String carModel, String carColor, int carYear, double carPrice) {
	    model=carModel;
		color=carColor;
		year=carYear;
		price=carPrice;
		
		
		
	}
	
	public static void main(String[] args) {
		

	}

}
