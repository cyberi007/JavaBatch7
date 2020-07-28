package com.syntax.class19;

public class iPhone {

	static String brand="Apple";
	static String OS="iOS";
	static boolean touchScreen=true;
	
	String model;
	int memory;
	double price;
	String color;
	
     static void displayInfo() {// static works only with static
        System.out.println("iPhone belongs to brand "+brand+" and it has OS as "+OS+" and all iPhones have touchscreen="+touchScreen);
     } 	 
    
     //static void displayDetails() { static methods cannot access instance/NON STATIC members/variables
     
     void displayDetails() {//instance works with static and non static
    	System.out.println("We build iPhone "+model+" with memory ="+" in "+color+" color for price=$"+price); 
    	 
     }	 
    	 
  // can instance method/non static method access members? YES
     
     
     
	
	
	
	
	
	
	
     }    

