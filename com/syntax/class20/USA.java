package com.syntax.class20;

public class USA {

	public static String country;
	String state;
	String capital;
	
	USA(String usaState, String stateCapital) { // declaring variables here
		
		state=usaState;        //this.state=state;
		capital=stateCapital;  //this.capital=capital;
		
	}

	public void display() {
		System.out.println("State is "+state+" and capital is "+capital);
		
	}
	public static void main(String[] args) {
		//USA TEST Class

		USA state1=new USA("Virginia","Richmond");
		state1.display();
		
		
	}

}
