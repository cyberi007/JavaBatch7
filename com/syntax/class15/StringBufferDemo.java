package com.syntax.class15;

public class StringBufferDemo {

	public static void main(String[] args) {
		
         StringBuffer strB=new StringBuffer("Hello");// is a mutable object
		strB.append(" friends");// when we perform operation it happens on same object and NO NEW object gets created
		System.out.println(strB);
		
		String str2="Hello";//String is Immutable object=not changeble
		str2.concat(" friends");//new object gets created that will have value "Hello friends"__>no one takes it 
		
		System.out.println(str2);//Hello
		
		String a="AAA";
		a=a.toLowerCase().replace("aaa","bbb");
		
		
		System.out.println(a);
		
		
	}

}
