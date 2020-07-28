package com.syntax.class11;

public class RetrivaluesFrom2DArrays {

	public static void main(String[] args) {
		// put the month of each season in one row

		String[][] months = {{"December","January","February"},
				      {"March","April","May"},
		              {"June","July","August"},
		              {"September","October","August"}};
		
		int rows = months.length;// how many arrays are inside,how many rows?
		System.out.println(rows + " rows");
		
		int winterLength=months[0].length;//how many elements/columns are in row with index 0?
		System.out.println(winterLength + " months in row 0");
		
		int lastRowSize = months[rows - 1].length;
		
		//Nested Loops with 2D Arrays
		
		for (int row = 0; row <months.length; row++) {//iterating over rows
			
		for (int col = 0;col< months[row].length; col++) { //iterating over rows
			
			System.out.println(months[row][col]);
			
		}
		
		
		}
	}
}
