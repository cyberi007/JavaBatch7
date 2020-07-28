package com.syntax.class24Overriding;

public class Parent {

	private void hello() { // Private methods don't participate in inheritance--> cannot override it
		System.out.println("Hello from parent class");
	}
	
	protected static void hi() {
		System.out.println("Hi from parent class");
	}
}
	
    class Child extends Parent{
	
	//creating own private method inside child class
	private void hello() {
		System.out.println("hello from child class");
	}
	 
	public static void hi() {
		System.out.println("Hi from child class");
	}
}
         // We can't override Private methods -- doesn't participate in Inheritance
         // We can't override Constructor -- doesn't participate in Inheritance
         // We can't override Static methods 
         // We can't override Main methods --- they are static
    
    
    //Overloading --> same method name within same class
    //-method signature is different
    //-return type doesn't play role
    //-access modifier can be different 
    
    
    
    //Overriding - same method name with parent and child class
    //-method signature is the same
    //-return type must be the same
    //-should be the same or more
    
    
    
    
    