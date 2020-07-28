package com.syntax.class20;

public class Car1 {

	     public static String make,color;
         protected String model;
         private double price;
         int year,door,speed;
	
	public void displayInfo() {
		System.out.println("We build "+year+" "+make+" "+model+" for price = $"+price);
	}
	
	Car1(){
		System.out.println("I am a constructor. I have not return type and my name is same as class");
	}
	
	
		public static void main(String[] args) {
        
        Car1 car=new Car1();
        
        //Car--> class name
        //car-->reference variable
        //new-->keyword
        //Car()-->calling Constructor-->block of the code that initialize the obj       
        
        make="BMW";
        car.model="M5";
        car.color="Pink";
        car.year=2021;
        car.door=2;
        car.speed=200;
        car.price=90000;
        
        Car1 car1=new Car1();
        
        car1.model="i5";
        car1.color="Blue";
        car1.year=2020;
        car1.door=4;
        car1.speed=180;
       // car1.price;-->when u forgot to assign a value or declare a variable java gives it($0.0)
        
        
        
        car.displayInfo();
        System.out.println(car.model);
        
        car1.displayInfo();
        
        //static String driver;--> local variables CAN NOT BE STATIC
        //System.out.println(driver);
        
	
	}
}
