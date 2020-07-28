package com.syntax.class24Overriding;

public class Area {

	// create 1 class in which create a methods that will calculate the area(volume) of:rectangle, square, box.
	// use separate class to test your code
 	
	public double area(double length,double width) {
		return length*width;
		
	}
	
	public double area(double length) {
		return length*length;
	
	}
	
	public double area(double length,double width,double height) {
		return 2*length*width+2*length*height+2*width*height;
	
	
	}	
	
	  public static void main(String[] args) {
	
	Area obj=new Area();
	
     System.out.println(obj.area(2.99,2.45));
     System.out.println(obj.area(5.45));
	 System.out.println(obj.area(12.3, 11.6, 12.8));
	
	
}
}




