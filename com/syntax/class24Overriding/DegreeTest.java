package com.syntax.class24Overriding;

public class DegreeTest {

	public static void main(String[] args) {
		
		Degree d=new Degree();
		d.getPrerequisite();
		
		Masters m=new Masters();
		m.getPrerequisite();
		
        Bachelors b=new Bachelors();
        b.getPrerequisite();
        
	}

}
