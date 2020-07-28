package com.syntax.class21;

public class AnimalsTest {

	public static void main(String[] args) {
		
		// Object of Parent class has an access to ONLY all variables and methods of its own class
		System.out.println("---obj Animal---");
		
		Animal a=new Animal();
		a.eyes=true;
		a.breed="Any";
		a.color="grey";
		a.paws=4;
		
		a.sleep();
		a.eat();
		
		//Object of Child class has an access to all variables and methods of its own class and Parent class
		System.out.println("---obj DOG---");
		
		Dog dog=new Dog();
		a.eyes=true;
		dog.breed="Husky";
		dog.color="Yellow";
		dog.paws=4;
		dog.tail=true;
		
		dog.eat();
		dog.sleep();
		dog.bark();
        
		System.out.println("---obj Cat---");
		
		Cat cat=new Cat();
		a.eyes=true;
		cat.breed="Siamian";
		cat.color="grey";
		cat.paws=4;
		cat.tail=true;
		cat.fur="white";
		
		cat.sleep();
		cat.eat();
		cat.purr();	
		cat.display();	
	}

}
