package com.syntax.class08;

public class SwitchStatement {

	public static void main(String[] args) {
		     
		String browser = "chrome";// if different letters to except//
		
		switch(browser) {// switch(browser.toLowerCase()) {
		
		case"chrome":
			System.out.println("Open chrome");
			break;
		case"firefox":
			System.out.println("Open firefox");
			break;
		case"ie":
			System.out.println("Open ie");	
			break;
			
			default:
				System.out.println("Invalid browser");
			
			
		}
		
		
		

	}

}
