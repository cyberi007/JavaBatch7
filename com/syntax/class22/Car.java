package com.syntax.class22;

public class Car {
	
	String make;

	public Car(String make) {
		this.make=make;
		// super();-->calls object
		System.out.println("i am non-arg C of parent class");
	}
	
}
	class Tesla extends Car{
		
		boolean autopilot;
	    
       public Tesla(String make,boolean autopilot) {
    	   super(make);
    	   this.autopilot=autopilot;
    	   //super();-->calls parent class
    	   System.out.println("I am non-arg C of child class");
          }
	void info() {
		System.out.println("We build "+make+" that has autopilot feature = "+autopilot);
	
}
	}
