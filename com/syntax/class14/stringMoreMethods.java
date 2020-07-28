package com.syntax.class14;

public class stringMoreMethods {

	public static void main(String[] args) {
		
//             System.out.println("-----------.charAt() method-----------");
//		
		String season="Summer";
//		char character=season.charAt(1);
//		System.out.println(character);
//		
//		    System.out.println("-----------.indexOf() method-----------");
//		
		    int index=season.indexOf('m');
		    System.out.println(index);
		    
		    String hello="Hello Ksenia";
		   int indexOfKsenia =hello.indexOf("Ksenia");
		   System.out.println("Index of Ksenia in the String "+hello+" is ="+indexOfKsenia);
		    
		
		    System.out.println("-----------.substring() method-----------");
		
		String message="You guys are awsome";
		String newMessage=message;
		System.out.println(newMessage);
		
		String substring=message.substring(4);// take string starting from index 4
		System.out.println(substring);
		
		String middleWord =message.substring(4, 8);// take string starting from index 4 and ending at index 8
		
		System.out.println(middleWord);
		
		
		String name="Maria";
	    String name1=new String();
        name1="Maria";
	
		System.out.println(name);
		System.out.println(name1);
		
		if(name.contentEquals(name1)) {
			System.out.println("Strings are equal");
		}
		
		if(name==name1) {
			System.out.println("Strings are equal");//using equal(==) operator
			
		
			String given = "I love Java classes at Syntax";
			  
			  String str1 =given.substring(12, 29);
			  System.out.println(str1);
	
		
		
		
	}	
	}
}

