package com.syntax.class16;

public class DifferentMethods {

	
		// lets create method that says hello any number of times

	void sayHello(int times) {
		
		for(int i=0;i<times;i++) {
			System.out.println("Hello");
		}	
	}
	
	//create that will print any word any number of times
	
	void printAnyWord(String word,int times) {
	
	for(int i=0;i<times;i++) {
		System.out.println(word);
	}
	}
	//create method isHungry that will accept boolean value
	//and prints, if passed value is true--> go cook or go sleep
		
	void isHungry(boolean areYouHungry) {
		
		if(areYouHungry) {
			System.out.println("Please cook");
		}else {
			System.out.println("go sleep");
			
		}
	}
	
	
}		
			
		
	
	
	
	
	
	
	


