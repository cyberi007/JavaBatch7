package com.syntax.class19;

public class AccessingEmployeeMembers {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		
		emp.lastName="Maya";
		emp.lastName="Podga";
		emp.age=30;//accessing protected
		emp.salary=100000;//accessing default
		//emp.ssn - won't be available because it's from different class and private
		
		emp.displayName();
		emp.displayAge();
		emp.displaySalary();
//emp.displaySsn(); won't be available because 
		
		
		
		
		
		
	}

}
