package com.syntax.class15;

public class ReplaceFunction {
	public static void main(String[] args) {
	
		
		String me="I am a good tester. I am a good person.";
		
		String str="Hello";
		
		str=str.replace('e', 'E');
		System.out.println(str);

		me=me.replace("good", "great");
          System.out.println(me);
		
          me=me.replace("we", "us");
           System.out.println(me);
          
           String fromApplication="Phone number is 1234567890";
           fromApplication.replaceAll("[A-Z]", "");
          System.out.println(fromApplication);//phone number is 1234567890
           //replacinf all characters from a-z
           fromApplication= fromApplication.replaceAll("[a-z]", "").trim();
           
           System.out.println("New String value is="+fromApplication);
           
           String another="Hello12345";
           another=another.replaceAll("[A-Z]", "").replaceAll("[a-z]", "");
           System.out.println(another);
           
           //another way
           
           String anotherWay="HellTodayIsTheBestDay";
           
           anotherWay=anotherWay.replaceAll("[A-Za-z]", "");
           System.out.println(anotherWay);
           
           //replacing all numbers [0-9] from the String,if specific [0-5];
           
           String mix="Hello76588 friends 0976886";
           mix=mix.replaceAll("[6-9]", "");//hello friends
           System.out.println(mix);
           
           //replacing all special characters(not letters or numbers);
           
           String mix1="hello &*%##%";
           mix1=mix1.replaceAll("[^A-Za-z0-9]", "");
           System.out.println(mix1);
           
           
           
           
//           String given="Hello Syntax friends";
//           
//           given = given.replace("Hello", "Welcome");
//           given = given.replace("friends", "family");
//               System.out.println(given);
//           
           
           
	}
}
