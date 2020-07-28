package com.syntax.class12;

public class Recap2DArray {

	public static void main(String[] args) {
		
               
		String [] [] animals= {
			
				{"cat", "dog", "bird", "hamster"},//1st array or 1 row
				{"tiger", "children", "bear"} //2nd row
				
				
		};
		
		int howManyArrays=animals.length;
		System.out.println(howManyArrays);
		
		int element1Array=animals[1].length;//how many columns in 2 row
		System.out.println(element1Array);
		
		String element = animals[1][1];
		System.out.println(element);
		
		//how to get all elements from 2D Array
		
		for (int r= 0;r<animals.length;r++) {//loops over rows or 1d arrays
			for(int c=0; c<animals[r].length; c++) {
				
				String animal = animals[r][c];
				
				System.out.println(animal);
			}
		}
		
	}
	
		
		
		
		
		
	}


