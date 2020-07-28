package com.syntax.class21;

public class ThisKeywordTest {

	public static void main(String[] args) {
		// related to Keyword class

		ThisKeyword obj=new ThisKeyword(100, 200);
		obj.sum(10, 20);
		
		ThisKeyword obj1=new ThisKeyword();
		obj1.sum(20, 50);
	}

}
