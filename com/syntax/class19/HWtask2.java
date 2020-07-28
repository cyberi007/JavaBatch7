package com.syntax.class19;

public class HWtask2 {

	public static void main(String[] args) {
		// Create a method that will take a String as a parameter and returns reversed String. 
		//Method should be available to all classes within your project and accessible by class name.
        System.out.println(rev("Hello"));
		System.out.println(reverse("Hello"));
		
	}
		public static String rev(String str) {
			String a="";
		for(int i=str.length()-1;i>=0;i--) {
			a=a+str.charAt(i);
		}
		return a;
	}

		public static StringBuffer reverse(String a) {
			
			StringBuffer strb=new StringBuffer(a);
			return strb.reverse();
			
		
		
		
}
}
