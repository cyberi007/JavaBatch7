package com.syntax.class17;

public class Task1 {

	
		 // 1 create a method createEmail().Based on values of users name, lastName and email type,
		 // your method should return complete email Address.Example;createEmail(Masha,Kotik,gmail)-->mashakotik@gmail.com 
         // 2 write a method to return whether given number is prime or not?
		 // 3 Create class Student that will have a method getGrade.Your method should accept the score of a student and return a grade:
		// score>90-A; score>80-B; score>70-C; score>50-D; anything else - F
		
		//1 
	        String createEmail(String name,String lastName, String emailType) {
			String mail=name+lastName+"@"+ emailType +".com";
			return mail.toLowerCase();
	        }
		//2 
			
			boolean isPrime(int a) {
				boolean prime = true;
				
				if(a>1) {
					for(int i=2; i<=a/i;i++) {
						if(a % i==0) {
							
							prime=false;
							break;
						}
					}
				}else {
					prime=false;
				}
				return prime;
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	        }	
	}


