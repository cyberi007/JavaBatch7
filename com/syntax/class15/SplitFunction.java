package com.syntax.class15;

public class SplitFunction {

	public static void main(String[] args) {
		
		String str="Today is Sunday and we have a Java class";
		
		String [] array=str.split("a");
		
		//String [] array=str.split("a");
		//String [] array=str.toLowercase().split("s"); if u want to leave "Sunday" u do to lowercase
		
		
				
		int howManyElements=array.length;
		
        System.out.println(howManyElements);
        
        //enchanced for loop
        
        for(String s:array) {
        	System.out.println(s);
        	
        	System.out.println("---------");
        	
        	// 1 Creat a string that will hold a sentence.
        	//Write a program to get a new String without any spaces.
        	
        	// 2 You have a string a="IS it Saturday Is it raining?Do we have Java Class today?"
        	//How would you find how many sentences are in that string?
        	
        	// one of the IQ
        	String str1="gggdfdg 56867586 ***&^^()^%$##";
        	str1=str1.replaceAll("[^A-Za-z]","");
        	
        	System.out.println(str1.length());
        	
        	String a="1.IS it Saturday 2.Is it raining 3.Do we have Java Class today?";
        	
        	String[] array1=a.split("[0-9]");
        	int sentences = array1.length;
        	System.out.println("Total number of sentences is " + sentences);
        }
        
        
        
        
	}

}
