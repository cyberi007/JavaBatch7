package com.syntax.class24Overriding;

public class Employee {

	     double salary;
	
	     void getPaid() { // Overridden method
	    	 System.out.println("Employee gets paid salary = "+ salary);
	     }
}
	class Contractor extends Employee{
		double hourlyRate;
	  
		void getPaid() {// Overriding method
			System.out.println("Contractor gets paid hourly rate ="+hourlyRate);
		}
}

	class FullTimeEmployee extends Employee{
	
	
	}