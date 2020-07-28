package com.syntax.class17;

public class MoreMethodsArray {

	public static void main(String [] args) {
	
		MoreMethodsArray obj=new MoreMethodsArray();
		
		int[] array= {56,46,23,90};
		
		int largest=obj.largestFromArray(array);
		System.out.println(largest);
		
		String [] words=obj.getWords("good night friends");
		
		for(String word:words) {
		
			System.out.println(word);
			
		}	
	}
		
	//create a method that should return the largest number from an array
	
	int largestFromArray(int[] array) {
		
		//find without using any functions
		
		int largest=array[0];
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i]>largest) {
			largest=array[i];
			}
		}
		
		return largest;
	}
		
		//create a method that will accept a String and return words from that String
		//Hello World,Good night friends
	
	       String [] getWords(String str) {
		
	       return str.split(" ");
	
	
	}
	
	
	
	
}
