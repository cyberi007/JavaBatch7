package com.syntax.class08;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		
       //  int i=1;

		//do {
		//	System.out.println("Hello, smart girl!");
			//i++;
		//}while(i<=5);
		Scanner inp = new Scanner(System.in);
	 
		 System.out.print("In: ");
		
		 
		    int x = inp.nextInt();
		  
		   
		    
		    for (x=0; x<=3; x++) {
		      if (x<=3) {
		    	  continue;}
		    	System.out.println(x);
		       
	       System.out.println("In: ");
	       
	       int y = inp.nextInt();
	            if (y<=8) {
	            	continue;}
	
	            	System.out.println(y);	

           }
	        System.out.print("In: ");
	       
	        int z = inp.nextInt();
	            if (z==5) {
            	continue;
	            	System.out.println(z);	
		    }	
		    }

}

}