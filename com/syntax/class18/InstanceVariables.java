package com.syntax.class18;

public class InstanceVariables {

	String name="Yuriy";// instance variable-declared out of the main method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Michelle";//local method-created inside the main method
		System.out.println(name);//Michelle
		
		//we create an Object or we instanciate a class or create an instance of the class
		InstanceVariables obj=new InstanceVariables();
		obj.name="Maya";
		System.out.println(obj.name);//Maya
		
		
		// i would like to change value from Michelle to Maria
		
		name="Maria";
		System.out.println("New value of instance variable "+name);
		
		// i would like to change value from Maya to Tea--> changing value of instance variable
		
		obj.name="Tea";
		System.out.println("New value of instance variable "+obj.name);
		
		
		System.out.println("Printing value of name using 2 instance");
		
		InstanceVariables obj1=new InstanceVariables();
		
		System.out.println(obj1.name);
		
		
		
		
		
		
	}

}
