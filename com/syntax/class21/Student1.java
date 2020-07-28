package com.syntax.class21;

public class Student1 {

	//Write a Student class that have instance variables name and address. 
	//Create a constructor that will initialize those variables. Print name & address of given student using displayInfo method.
	
	String name, address;
	
	Student1(String Sname, String Saddress) {
		
		name=Sname;
		address=Saddress;
		
	}
	void displayInfo() {
		System.out.println("Student name is "+ name+" and his address is "+ address);
		
		
		
		
	}
	
	
}
