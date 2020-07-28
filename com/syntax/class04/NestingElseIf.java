package com.syntax.class04;

public class NestingElseIf {

	public static void main(String[] args) {
		
		//if student completed the quiz we will check the score
		//if score is > 90 --> A, Great job!
		// if score> 80--> B, Well done!
		// if score > 70 --> C, Just passed!
		//Otherwise --> F, You failed!
		//
		// if stud didn't complete the quiz, Please finish it
		
		
		boolean Cquiz = true;
		int score = 69;
		
		if (!Cquiz) {
			System.out.println("Please, finish your quiz!");
		}
		
		if (Cquiz) { 
			if (score >= 90) {
				System.out.println("A, Great job!");
			
			}else if (score >= 80) {
			System.out.println("B, Well done!");
		}else if (score >= 70 ) {
			System.out.println("C, Just passed!");
		   } else {
			   System.out.println("You are failed");
	
			
		}
			
			
		 }
	
	}
		

	
	}

