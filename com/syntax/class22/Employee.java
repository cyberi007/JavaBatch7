package com.syntax.class22;

public class Employee  {

	public static String companyName;//accessible for the entire project
	protected String fullName;//accessible for the same package unless inherited
	double salary;//accessible for the same package
	private long ssn;//accessible for the same class
	
	public void work() {
		System.out.println("Employee works");
	}
	
	public void getPaid() {
		System.out.println("Employee gets paid");
	
	}
}

     class ScrumTeam extends Employee {
	
    	 String ceremonies;
    	 
    	  void attendMeetings() {
    		  System.out.println("attends meetings");
    	  }
    	 
    	 void workBuildingSoft() {
    		 System.out.println("work on building software");
    	 }
     } 
    	 
     class ProductOwner extends ScrumTeam{
    	 
    	 void communicate() {
    		 System.out.println("gets requirements form BA");
    	 }
     
         void proiritizePB() {
    	    System.out.println("proiritizes product backlog");
     }
     }
     
     class ScrumMaster extends ScrumTeam {
    	 
    	 String quality;
    	 
     void shieldTeam() {
    	 System.out.println("All team shielded");
     }
     
     void doMeetings() {
    	 System.out.println("Allvteam do attending meeting");
     }
     
     class tester extends ScrumTeam{
    	 
    	 void test() {
    		 System.out.println("Tests software for bugs");
    	 }
     }
     
     
}







