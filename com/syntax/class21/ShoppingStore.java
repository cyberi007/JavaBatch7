package com.syntax.class21;

public class ShoppingStore {

	 String item;
	 double price,quantity;
	
	ShoppingStore(String item,double price, double quantity){
		
		this.item=item;
		this.price=price;
		this.quantity=quantity;
	}
	double TotalPrice() {
		 
		 double TotalPrice=this.price*this.quantity;
		 
		System.out.println(item+" Total Value "+TotalPrice);
		
		return TotalPrice;
	}
	

	}
	


