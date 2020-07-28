package com.syntax.class23;

public class MethodOverloading {

	// lets create a method add
	//1. achieve by changing number of parameters
	int sum(int num1,int num2) {
		
		return num1+num2;
	}
	
	//public void sum(int num1,int num2) { -- u cant overload by changing the return type only
	
	public int sum(int num1,int num2,int num3) {
		
		return num1+num2+num3;
			
	}
	
	//2. way -by changing type of the parameters
	
	public double sum(double num1,double num2) {
		return num1+num2;
	}
	
	public double sum(double num1,double num2,double num3) {
		 return num1+num2+num3;
	}
	
	
	
}
