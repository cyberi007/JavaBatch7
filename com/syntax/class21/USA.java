package com.syntax.class21;

import com.syntax.class20.USA;

public class USA {

	public static String country;
	String state;
	String capital;
	
	USA(String state, String capital) { 
		
		this.state=state;        //this.state=state;
		this.capital=capital;  //this.capital=capital;
		
	}

	 void displayState() {
		System.out.println("State is="+state);
		
	}
	 void displayCapital() {
		 System.out.println("Capital is="+capital);
	 }
		void displayInfo() { // this.displayState(); Compiler adds this to reffer to instance method
		this.displayState(); // can be without "this"
	    this.displayCapital();
	
	
		}
}
