package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Lets have a date of month and a day of week
		// if it is Friday--> we are going to watch movie
		
		//  if date is 13 --> Watch a SCARY movie
		//  if date is not 13--> Watch a COMEDY
		
		
		//  if it is not Friday--> We are going to study JAVA
		boolean isFriday = true;
		int date = 17;
		int t = 23;
		
		if (isFriday) {
			System.out.println("we are going to watch movie");
			
			if (date == 13) {
			System.out.println("We watch scary movie");
			
		    }else {
			System.out.println("We watch a comedy");
		          }
			    if (t < 23) {
				System.out.println("We drink wine");
			    
			        if (t > 23)	{
				System.out.println("We go to sleep");
			        }
			
			     } else  {
				System.out.println("We drink coffee");
			            }
		
		
		}else {		
		System.out.println("We are going to study Java");		
				
				
		}			
				
				
		
				
				
				
				
			}
			
			
		
		
		
		
		
		
		
		
		
		
		
	}


