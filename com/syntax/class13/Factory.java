package com.syntax.class13;

public class Factory {

	public static void main(String[] args) {
	
	//building an object of the car
		Car car1=new Car();
		car1.make="Tesla";
		car1.model="X";
		car1.color="red";
		car1.year=2020;
		car1.speed=200;
		System.out.println("Make of first car is" + car1.make + " end model is " + car1.model + "colour is " + car1.color + "."+ "But i'm gonna get Volvo" + "!");
		
	//building an object of the car
		
		Car car2=new Car();
		car2.make="BMW";
		car2.model="M5";
		car2.year=2018;
		car2.speed=240;
		
		System.out.println(car2.make);
		
		Car car3 = new Car();
		car3.make = " Crazy Flyer";
		car3.model = "Flying car";
		car3.year = 2020;
		car3.speed = 750;
		
		System.out.println(car3.make + " is the best car in the world" + "!");
		
		System.out.println("Accessing methods from Car class using car1----");
		car1.drive();
		car1.reverse();
		car1.transportPeople();
		System.out.println("Accessing methods from Car class using car2----");
		car2.drive();
		car2.reverse();
		car2.transportPeople();
		System.out.println("Accessing methods from Car class using car3----");
		car3.drive();
		car3.reverse();
		car3.transportPeople();
		car3.fly();
}
}