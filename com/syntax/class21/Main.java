package com.syntax.class21;

public class Main {

	public static void main(String[] args) {
//		
//		Person P=new Person();
//		P.name="name";
//		P.lastName="lastName";
//		P.age=45;
		
	
		Employee E=new Employee();
		E.name="Joe";
		E.lastName="Smith";
		E.age=35;
		E.salary=35000;
		
		E.print();
		
		Student S=new Student();
		S.name="Adam";
		S.lastName="Smith";
		S.age=15;
		S.grade=10;
		
		S.print();
		
		Retiree R=new Retiree();
		R.name="Frank";
		R.lastName="Smith";
		R.age=15;
		R.seniorActivity="tour";
		
		R.print();
		
		
		
	}

}
