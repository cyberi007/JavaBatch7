package com.syntax.class27;

public interface Drivable {// interface is a collection of the public abstract methods and public static final variables
	
	
        // int maxSpeed; cannot have instance variables cause compiler add "public static final"
         
	String DRIVE="Drive safe";// by default compiler adds "public static final" to methods
	

      void driving();// "public abstract" compiler add by default
 
      void breaking();
 
 
}
//we can extends ONLY 1 class but implement Multiple interfaces

	 abstract class Motorcycle extends Vehicle implements Drivable { //abstract class
	
	public void driving() {
		System.out.println("Motorcycle is driving");
	}

}
	 
	 class Bike extends Motorcycle{ //concrete class
		 
		 public void breaking() {
			 System.out.println("Bikes can break");
		 }
	 } 
		 
	 class Vehicle {
			public void operatevehicle() {
				System.out.println("To operate any vehicle we need driver licence");
		 
		 
	 }
	 }
	 
	 
	 
	 
	 
	 
	 
	 