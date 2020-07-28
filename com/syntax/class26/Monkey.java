package com.syntax.class26;

public abstract class Monkey { // we have 0% abstraction

	public void jumps() { 
		System.out.println("Monkey jumps");
	}
}	
	abstract class Mouse {// now it's 50% abstraction
		
		public void run() {
			System.out.println("All mouses can run");
		}
	
	public abstract void eat();//we making it abstract cause we don't implement it
}

	abstract class Human{//100% abstraction
		
		public abstract void eat();
		public abstract void work();
		public abstract void sleep();
	}
	
	
	
	
	
	
	
	
	