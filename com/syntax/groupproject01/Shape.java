package com.syntax.groupproject01;

public interface Shape {


	 void calculateArea(int radius);
	
	 void calculatePerimeter(int num);
	
}
class Circle implements Shape{
	int radius;
	int num;
	
	@Override
	
	public void calculateArea(int radius) {
		this.radius=radius;
		System.out.println("Are of circle is: " + this.radius*this.radius*3.14);
	
	}
	
	@Override
	public void calculatePerimeter(int num) {
		System.out.println("Perimeter of circle is: " +2*3.14*radius);
	
	
	}
	
}
	
	class Square implements Shape {
		int num;
		int radius;
		
		@Override
		
	public void calculateArea(int length) {
	this.radius=length;
	System.out.println("Area of square is:");
			
		}		
			
	@Override
	
	public void calculatePerimeter(int num) {
		this.num=num;
	}
		System.out.println("Perimeter of square is: " +num*4);
		
	
	}
}
	
	
	
	
	
	
	
	
	

