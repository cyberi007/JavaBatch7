package com.syntax.class14;

import java.util.Scanner;

public class BigTaskMixed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Please enter Username");
		 String username = scan.next();
		 System.out.println("Please enter password");
		 String password = scan.next();
		 
		 if(username.isEmpty() || password.isEmpty()) {
			 System.out.println("Username and Password cannot be empty");
			
		 }else {
			 
			 if(password.length()>8) {
				 
				 if(!password.contains(username)) {
					 
					 System.out.println("Please confirm your password");
					String confirmedPwd =scan.nextLine();
					
					if(password.equals(confirmedPwd)) {
						
						System.out.println("Your username and password has been created");
					}else {
						System.out.println("Password do not match");
					}
					
				 }else {
					 System.out.println("Password cannot contain username");
				 }
				
			 }else {
				 System.out.println("Password is too short");
			 }
			 
			 System.out.println("Continue to next checkpoints");
			 
			 
			 
			 
			 
			 
		 }
		 
		 
	}

}
