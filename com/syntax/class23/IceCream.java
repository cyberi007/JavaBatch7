package com.syntax.class23;

public class IceCream {// parent class

	String flavor, brand, color;
	
	public IceCream(String flavor,String brand, String color){
		this.flavor=flavor;
		this.brand=brand;
		this.color=color;
	}	
}	
		class Gelato extends IceCream {
			
			public Gelato(String flavor,String brand, String color) {
				super(flavor,brand,color);
				
			}						
		}						
			
		class Sorbeto extends IceCream {//child for IceCream class , but parent for MiniSorbeto class
			
			double price;
			
			public Sorbeto(String flavor,String brand, String color,double price) {
				//this.price=price;CE
				super(flavor,brand,color);//--call your parent class is the first step---super always must be first
				this.price=price;
				
			}	
			
			public Sorbeto(String flavor,String brand, String color) {
				super(flavor,brand,color);
				
			}
			
		}
			
		
		class MiniSorbeto extends Sorbeto {// is a Grandchild class
			int calories;
			
			public MiniSorbeto(String flavor,String brand, String color,double price, int calories) {
			super(flavor,brand,color,price);
			this.calories=calories;// own variable of Grandchild class,lets why we add it to constructor
			
			}
		}
		
	
		
			
			
			

