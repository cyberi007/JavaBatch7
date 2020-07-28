package com.syntax.class18;

public class LocalVariables {

	public static void main(String[] args) {
		
		String name="Maria";// local to main method and its scope only within main method
		
		for (int i=1;i<=5;i++) {
			System.out.println("Today is a Java Class");
		
		System.out.println(i);
		
		}
		
		//System.out.println(i); variable i isn't visible because its out of the method
	
		
		//String name="Ali"; CE-the same variable "name"
		
		int a;//declare a variable---it's local for main method
		
		for(a=0; a<=3; a++) {// here to put int a=0 isn't necessary, just a=0
			System.out.println(a);
		}
		
		System.out.println(a);
		
	}
		void displayName() {
			//System.out.println(name);//CE-should be inside the main method otherwise its not visible
		}
		
		// create a method to return sum of 2 numbers
		
		int sum(int num1, int num2) {//num1 and num2 local variables to method sum
		
		return num1+num2;
		}
		
		double div(double num1, double num2) {//num1 and num2 local variables to method div
        return num1/num2;
	
		}
}
