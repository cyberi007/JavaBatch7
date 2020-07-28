package com.syntax.class24Overriding;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.salary=90000;
		emp.getPaid();
		
		
		Contractor ct=new Contractor();
		ct.hourlyRate=100;
		ct.getPaid(); // Overriding method from the child class will get executed
		
		
		FullTimeEmployee ft=new FullTimeEmployee();
		ft.salary=140000;
		ft.getPaid();// parent method getPaid is executed
		

	}

}
