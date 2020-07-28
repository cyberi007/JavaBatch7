package com.syntax.class14;

public class RealExamplesofEquals {

	public static void main(String[] args) {
		// Real example

		String expected="Password cannot be empty";
		String actual="passsword cannot be empty";
		if(expected.equals(actual)) {
			
			System.out.println("Test pass");
			
		}else {
			System.out.println("Test fail");
			
			System.out.println("-----real example of equalsIgnoreCase---");
			
			String expectedBrowser="Chrome";
			
			if(expectedBrowser.equalsIgnoreCase("chrome")) {
			System.out.println("Test executed on chrome browser");
			
			}else {
				System.out.println("Test executed NOT on chrome browser");
			}
				
		}
	}
}	
		
		
		
		
	


