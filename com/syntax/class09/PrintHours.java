package com.syntax.class09;

public class PrintHours {

	public static void main(String[] args) {
		// Let us print the clock:
		//0:00
		//0:01
		//....
		//1:00
		//1:01
		//...
		//23:58
		//23:59
//hour goes from 0 to 23 and minute goes from 0 to 59
		
		//for(int h = 0; h<24; h++) {
			
			
			
			//for(int min = 0; min<60; min++) {
				
				//System.out.println(h + ":" + min);
				
				
				for(int h = 0; h<24; h++) {
					
				
					for(int m = 0; m<60; m++) {
						
					
					if (m<10) {
						System.out.println(h + ":0" + m);
						
					} else {
						
						System.out.println(h + ":" + m);
				
			}
		}
		
				}
		
	}
}


