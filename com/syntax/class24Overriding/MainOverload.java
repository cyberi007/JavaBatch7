package com.syntax.class24Overriding;

public class MainOverload {

		
	public static void main(String str) {
     System.out.println("I am a main method with String");// to execute--pass any parameter
	}
	
	public static void main(String str, int num) {// to execute--pass 2 any parameters
	     System.out.println("I am a main method with 2 parameters");
	}   
	     
	     public static void main(String[] args) {
	         System.out.println("I am a main method with String array");
	    	
	     main("main");
	     main("main",4);
	     

}
}