package com.syntax.class21;

public class ShoppingStoreTest {

	public static void main(String[] args) {
	
		ShoppingStore b=new ShoppingStore("Blanket",99.98,1);
		ShoppingStore m=new ShoppingStore("Mattress",43.918,10);
	
		
		double bTotalprice=b.TotalPrice();
		double mTotalprice=m.TotalPrice();
		double sum=bTotalprice+mTotalprice;
    System.out.println("You purchased "+sum+" Today");
	
		
	}
}

