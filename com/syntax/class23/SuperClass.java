package com.syntax.class23;

public class SuperClass {

	String name="Kamila";
	
	public void printHello() {
		System.out.println("Hello from parent class");
	}
}
	class SubClass extends SuperClass {
		
	String name="Mina";
	
	public void displayName() {
		System.out.println(this.name);
		System.out.println(super.name);
	}
	public void printHello() {
		System.out.println("Hello from child class");
	}
	
	public void callingParentmethod() {
		//printHello();//this.printHello
		super.printHello();// calling Parent class method
	
	}
	
	
}
