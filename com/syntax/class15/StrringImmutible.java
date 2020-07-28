package com.syntax.class15;

public class StrringImmutible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String str = "Today is a good day";//new object gets created
           
           str=str.replace("good", "amazing");//new object gets created and that object is assigned to str
           	System.out.println(str);	
		
		str.concat(".I love Sundays");//new object gets created but no one is reffering to that object
		System.out.println(str);//original str did not get changed
		
		String str1=new String("Hello ");
		str1=str1.concat("students");
		str1.toUpperCase();
		
		System.out.println("Value of str1="+str1);
		String str2="Hello";
		String str3="Hello";
		String str4="Hello";
		
		str2.toUpperCase();//completely new string object is getting created
		System.out.println("Value of str2 if we did not assignt it="+str2);
		str2=str2.toLowerCase();
		System.out.println("Value of str2 after assignment="+str2);
		System.out.println("Value of str3="+ str3);
		System.out.println("Value of str4="+ str4);
		
		String str5=new String("Bye");
		System.out.println(str5);
		
		
	}

}
