package com.syntax.class22_1;

import com.syntax.class22.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		Employee.companyName="Google";
		
		//new ScrumTeam(); not available cause it's default--they are not visible from the dif classes and dif packages 
		
		WaterFallTeam wt=new WaterFallTeam();
		WaterFallTeam.companyName="Amazon";
		
		System.out.println();

	}

}
