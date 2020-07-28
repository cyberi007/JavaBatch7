package com.syntax.class14;

public class Stringmethods {

	public static void main(String[] args) {
		// 1st way to create a String
		String name="Masha";//literal
				
		// 2nd way to create String	
		
		String name1=new String();
		name="Masha";
		
		System.out.println(name);
		System.out.println(name1);
		
		// methods of the String class
		
		String school="Syntax";
		System.out.println("------.length() method-----");
		//tells how ny characters are in the String
	      int size =school.length();
	  System.out.println("The length of the String is ="+ size);//here are 6 characters
		
		String greetings = "Hello,Syntax";
		int sizeOfDifferentString=greetings.length();
		System.out.println(sizeOfDifferentString);
		
		System.out.println("-----.toUpperCase() method------");
         
		String city="Washington DC";
		String newCity=city.toUpperCase();
		
		System.out.println(newCity);
		
		System.out.println("-----.toLowerCase() method------");
		
		String lowerCaseString=newCity.toLowerCase();
		System.out.println(lowerCaseString);
		
		System.out.println("-----.concat() method------");
		
		String country="USA";
		String capital="Washington DC";
		
		//+ with Strings serves as concatenation operator
		//+ with numbers serves as arithmetic operator
		
		System.out.println(country+ capital);//any type
		
		System.out.println(country.concat( capital));//concat method will work only if both values of the String type
		
		int day=27;
		String month=" June ";
		
		System.out.println(day+month);
		
		//System.out.println(month.concat(day));//can't use cause both values must be String
		
		System.out.println("-----.isEmpty() method------");
		
		String str="";
		boolean isEmpty=str.isEmpty();
		
		System.out.println(isEmpty);
		
		System.out.println("-----.trim() method------");
		
		String cat="Jessy";
		String dog="  Charly  ";
		System.out.println(cat);
		System.out.println(dog);                 //CUT spaces at the beginning and END of the String -- CUT the WHITE Spaces
	
		System.out.println("AFTER triming");
		
		System.out.println(cat.trim());
		System.out.println(dog.trim());
		
		
		
		
		
		
	}

}
