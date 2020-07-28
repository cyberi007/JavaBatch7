package com.syntax.class20;

public class StoreProduct {

	String label, category;
	int stock;
	double price;
	boolean hasExpiration; 
	
	StoreProduct(String SPlabel,double SPprice,String SPcategory,boolean SPhasExpiration,int SPstock) {
	    label =SPlabel;
		price=SPprice;
	    category=SPcategory;
		hasExpiration=SPhasExpiration;
		stock=SPstock;
	}
	StoreProduct(String SPlabel,double SPprice,int SPstock) {
	    label =SPlabel;
		price=SPprice;
	    category="misc";
		hasExpiration=false;
		stock=SPstock;
		
	}	
	StoreProduct(String SPlabel,double SPprice) {
	    label =SPlabel;
		price=SPprice;
		hasExpiration=false;
		stock=0;
		
	}
	public void displayInfo() {
		System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
	}
	

}
	
	
		
		
		
		

	


