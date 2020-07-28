package com.syntax.class22;

public class EmployeeTest {

	public static void main(String[] args) {
		
		ScrumTeam obj1=new ScrumTeam();
		
		
		ScrumTeam.companyName="Facebook";//accessing the static variable by the name of class where it was created,also from his child class,cause child class has an access to a parent class
		obj1.fullName="John Doe";
		obj1.salary=70000;
		obj1.getPaid();
		obj1.work();
		//obj1.ssn - not visible cause their private. Private doesn't participate in inheritance
		
		obj1.attendMeetings();
		obj1.ceremonies="Scrum meetings";
		obj1.workBuildingSoft();
		
		ProductOwner obj2=new ProductOwner();
		ProductOwner.companyName="Facebook";
		obj2.salary=100000;
		obj2.getPaid();
		obj2.work();
		
		obj2.ceremonies="Scrum meetings";
		obj2.attendMeetings();
		obj2.workBuildingSoft();
		
		obj2.communicate();//his own feature
		
		

	}

}
