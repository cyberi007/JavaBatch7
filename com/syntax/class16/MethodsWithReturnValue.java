package com.syntax.class16;

public class MethodsWithReturnValue {
	public static void main(String[] args) {
	//create a String and based on the number of characters define whether String is long or short
	//long if length>10 , short if less
	
	String str="I love Java";
	
	int length=str.length();
	
	if (length>=10) {
		System.out.println("Created string is long");
	} else {
		System.out.println("Created string is short");
	}
	
	//identify which number is the largest and then define if its even or odd
	
	task1 obj=new task1();
	
	obj.larger(10, 20);
	
	}
	int largest(int a, int b) {
		int largest;
		if(a>b) {
	largest=a;
		}else {
			largest=b;
			}
		return largest;
		
		}
	
}
