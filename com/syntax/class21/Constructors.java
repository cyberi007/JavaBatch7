package com.syntax.class21;

public class Constructors {

        String word;
		public Constructors() {
			System.out.println("I am a non arg constructor");
		}	
			
		public Constructors(String word) {
		this(12,word);// always must be a first statement
		this.word=word;
		//this(); should be the 1st line
		System.out.println("I am a parametrized C with str ="+word);
		}
		public Constructors(int num) {
			System.out.println("I am a C with 1 parameter="+num);
		}
		public Constructors(int num, String word) {
			System.out.println("I am a C with 2 parameters="+num+" and "+word);
		}
		
		//Public Constructors(String str){ //CE: we can't have a duplicate constructors
		//System.out.println("I am a C with 1 parameter="+num);
        //}
		
		public static void main(String[] args) {
			
			Constructors obj=new Constructors("Java");
			System.out.println(obj.word);
			
	}
        
//		void hello() {
//			this();   // can be used only within constructors
		}

