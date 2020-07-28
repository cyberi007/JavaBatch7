package com.syntax.class20;

public class StudentTest {

	public static void main(String[] args) {
		
        Students student1=new Students("Smith",70,80,90);
        Students student2=new Students("Adam",45,64,11);
        Students student3=new Students("Lucy",36,28,54);
        Students student4=new Students("mary",90,90,95);
        Students student5=new Students("Michael",45,78,29);
        
        System.out.println(student1.MethodCalcAvarageGrade());
        System.out.println(student2.MethodCalcAvarageGrade());//int grade2=student2.MethodCalcAvarageGrade()
        System.out.println(student3.MethodCalcAvarageGrade());//sout:("Avarage of grade of 2 student is "+grade2);
        System.out.println(student4.MethodCalcAvarageGrade());
        System.out.println(student5.MethodCalcAvarageGrade());
	}
}
