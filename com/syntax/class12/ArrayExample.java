package com.syntax.class12;

public class ArrayExample {



		
         //Array is a tray of tea cups
		
		int num1 = 10;
		int num2 = 15;
		int num3 = 20;
		int num4 = 25;
		
		//declare and initialize one array of integers
		int[] numbers = new int[4];// elements from 0 to 3
		numbers[0] = 10;
		numbers[1] = 15;
		numbers[2] = 20;
		numbers[3] = 25;
		
		System.out.println(numbers[3]);
		
		int element0=numbers[0];
		//we are just declaring, not initializing
		String[] carArray;//preferred way
		String carArray1[];// not preferred way
		
		//we are creating/initializing the Array
		carArray = new String[3];//the size is 3 but the numbers- 0 1 2 
		//storing cars
		carArray[0] = "BMW";
		carArray[1] = "Toyota";
		carArray[2] = "Benz";
		//carArray[3] = "Tesla";// runtime-error
		
		
		String car=carArray[2];
		
		System.out.println(car);
		
		System.out.println("-------------------");
		
		char[] letters = new char[4];
		letters[0] = 'A';
		letters[3] = 'B';
		letters[2] = 'G';
		letters[1] = 'Z';
		
		System.out.println("printing before re-assigning " + letters[2]);
		
		//re-assigning another letter into spot with index 2
		letters[2] = 'K';
		
		System.out.println("printing after re-assigning " + letters[2]);
		
		 char[] letters = {'s', 'a', 'y', 'b' , 'n', 'c', 't', 'd', 'a', 'e', 'x'};
		    
		    System.out.print(nums[0] + " " + nums[1] + " " + nums[4] + " " + nums[6] + " " + nums[1] + " " + nums[10] );
		
		
	}

}
