package com.syntax.class26;

public class VehicleTest {

	public static void main(String[] args) {
		
		Vehicle lambo=new Lamborgini("1234567675kdjfjdfjjg");
		lambo.drive();
	    lambo.start();
	    lambo.stop();
	    lambo.openTrunk();
		int total=Vehicle.getTotal();
		System.out.println(total);
	    
		System.out.println("---second obj---");
		
		Car car = new Lamborgini("1234567675kdjfjdfjjg");
		lambo.drive();
	    lambo.start();
	    lambo.stop();
	    lambo.openTrunk();
		
        total=Car.getTotal();//child class
	    System.out.println(total);
	    
	    
	}

}
