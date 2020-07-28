package com.syntax.class04;

import java.util.Scanner;

public class Scannerdemo2 {

	public static void main(String[] args) {
		
		//System.out.println("Please enter your age: ");
		
		Scanner scan=new Scanner(System.in);
//	
//           int num=scan.nextInt();
//
//
//          int[] nums = {5,4,3,2,1};
//	
//		for(int i=0;i<nums.length;i++ ) {
//		
//		
//			//int num=scan.nextInt();
//		
//		System.out.println(nums[i]);

//		int age=scanner.nextInt();
//		if(age>=18) {
//			System.out.println("You can drive in US");
//			
//		}else {
//			System.out.println("You need to grow up");
//			
//			
//			
//			System.out.println("Enter True or False");
//			
//			boolean trueOrfalse= scanner.nextBoolean();
//			
//			System.out.println("You entered : " +trueOrfalse);
//			
//			
//			
//			System.out.println("**************");
//			
//			System.out.println("Please Enter First Name");
//			  String name = scan.nextLine();
//			  System.out.println("Please Enter Surname");
//			  String name = scan.nextLine();
		String[] day=new String[7];
	       for(int i = 0;i<day.length; i++) {
	         int j=(i+1);
	      System.out.println("Please enter day " + j + " of the week");  
	         
	      String week=scan.nextLine();
	      day[i]= week;
	      continue;
			
			
			
		}	
			
		}
		
		
		
		
	}


