package com.syntax.class20;

public class BetterCarTest {

	public static void main(String[] args) {
		// creating and obj of betterCar

		BetterCar car=new BetterCar("X5","Red",2020,80000);
		car.displayInfo();
		
		BetterCar car1=new BetterCar("Model S","Silver",2019,90000);
		car1.displayInfo();
		
		//new BetterCar(carModel, carColor);CE:bc we don't have a constructor with 2 parameters inside BetterCar class
		
		//new BetterCar();CE:bc we don't have a non argument constructor inside BetterCar class
		
		
		
	}

}
