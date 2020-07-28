package com.syntax.class17;

public class TaskTest {

	public static void main(String[] args) {
		// call the methods

		 Task1 t=new Task1();
		String email=t.createEmail("Maya", "Love", "yahoo");
		System.out.println(email);
		
		
		boolean prime=t.isPrime(74);
		System.out.println(prime);
		
		Student student=new Student();

         char grade =student.getGrade(90);
		
         char grade1=student.grade(90);
		
		System.out.println("Value of grade="+grade);
		System.out.println("Value of grade1="+grade1);
		
		
	}

}
