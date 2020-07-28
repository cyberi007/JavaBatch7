package com.syntax.class14;

public class MoreStringMethods {

	public static void main(String[] args) {
		
		System.out.println("------.contains() method--------");
		// checks if String contains another sequence of specified characters

		String str="Good afternoon all";
		boolean contains=str.contains("afternoon");
		
		String searchValue="good";
		boolean isItThere=str.contains(searchValue);
		System.out.println(isItThere);
		
		System.out.println(str.contains("A"));
		System.out.println(str.contains("after"));
		
		System.out.println("-----------.startsWith() method-----------");
		
		String drink = "Welcome students";
		boolean starts = drink.startsWith("Welcome");
		System.out.println(starts);
		
		System.out.println("-----------.endsWith() method-----------");
		
		boolean ends = drink.endsWith("Welcome");
		System.out.println(ends);
		
		//drink.startsWith('w'0; CE: we need to check if it starts with specified String, can't be just char
		
		String str1="Hello Masha";
		String str2="Hello Maya";
		str1.startsWith("Hello");
		str2.endsWith("Maya");
		
		System.out.println(str1.startsWith("Hello"));
		
		System.out.println(str2.endsWith("Maya"));
		
		System.out.println("-----------.equals() method-----------");
		
		String string1="Saturday";
		String string2="saturday";
		
		boolean equality=string1.equals(string2);
		System.out.println(equality);
		
		boolean equalityNoCase=string1.equalsIgnoreCase(string2);
		
		System.out.println(equalityNoCase);
		
		
		
		
	}

}
