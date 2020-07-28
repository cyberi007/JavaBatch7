package com.syntax.class20;

public class Task {

	  // Write a program that will have a constructor: one with parameters and second without any parameters.
	 //Create a separate Test class where you will execute both of the constructors 1 by 1.
	
	
	
	String name,lastName;
	int age;

	public void displayInfo() {
		System.out.println("My name is "+name+" my lastname is "+lastName+ " age is "+ age);
	}
	
	Task(String Taskname,String TasklastName, int Taskage) {
		
		name=Taskname;
		lastName=TasklastName;
		age=Taskage;
	}
	
	Task() {
		System.out.println("I am a constr without a parameters");
	}
	
	public static void main(String[] args) {
		
      Task task=new Task("Maria","Kotik",35);
      task.displayInfo();
      
      Task task2=new Task();
     
      
		}

	 
		
	}
		
		
		
	


