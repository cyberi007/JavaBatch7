package com.syntax.class06;

public class Recap {

	public static void main(String[] args) {
		
		// if hour is between 1 - 11 -->morning
		// if hour is between 12 - 15 -->afternoon
		// if hour is between 16 - 20 -->evening
		// if hour is between 21 - 24 -->night
		
		//we will print :Right now is _______
		
		
		
		int hour = 35;
		String dayTime = "";
				
		
		
		if (hour>= 1 && hour < 11) {
			
			dayTime = "morning";
		
		} else if (hour >=12 && hour <=15 ) {
		
			dayTime = "afternoon";
			
		}else if (hour >=16 && hour <= 20) {
			dayTime = "evening";
			
		}else if (hour >= 21 &&  hour <=24) {
			
			dayTime = "night";
		
		} else {
			dayTime = "unknown";
		}
		
		//if it is unknown i dont want to print it
		if(!dayTime.equals("unknown")) {
			

			System.out.println("Right now it is " +  dayTime);
			
			
		
			
			
			
			
		}
			
			
		
		
		
		
		
		

	}

}
