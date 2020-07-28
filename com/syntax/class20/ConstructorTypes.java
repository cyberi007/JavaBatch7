package com.syntax.class20;

public class ConstructorTypes {

	ConstructorTypes() {
	System.out.println("I am a constructor without a parameter");//non argument constructor
	}
	
	ConstructorTypes(String str) {// parameterized constructor
	System.out.println("I am a constructor with 1 parameter "+str);
	
	}
	
	ConstructorTypes(int num) {
		System.out.println("I am a constructor with 1 parameter "+num);
	}
	
	ConstructorTypes(double num) {
		System.out.println("I am a constructor with 1 double parameter "+num);
	
	}
	
	ConstructorTypes(String name,int age) {
		System.out.println("I am a constructor with 2 parameters "+name+" "+age);
		
	}
	
	public static void main(String[] args) {
	
	
		ConstructorTypes obj=new ConstructorTypes(100);
		ConstructorTypes obj1=new ConstructorTypes("Love");
		ConstructorTypes obj2=new ConstructorTypes();
		ConstructorTypes obj3=new ConstructorTypes(10.99);
		
		ConstructorTypes obj4=new ConstructorTypes("Maria", 35);
		
		System.out.println("I am a code inside main method");
		
		speak("Hello Class");
	}
		
		static void speak (String str) {
			System.out.println(str);
		
		
		
		
		
		
		
		
}
	}	

