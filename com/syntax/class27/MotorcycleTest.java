package com.syntax.class27;

public class MotorcycleTest {

	public static void main(String[] args) {
		
		
		// can not open the object new Drivable()
		
		//new Motorcycle(); can not instantiate,cause it's incomplete
		System.out.println("---Obj of Motorcycle type---");
          Motorcycle m =new Bike();
          m.driving();
  		  m.breaking();
  		  m.operatevehicle();
  		  //Motorcycle.DRIVE="not safe":CE:can not change the value of variable(of final v)
  		  System.out.println(Motorcycle.DRIVE);//static var accessible from class name
  		  
          System.out.println("---Obj of Drivable type---");
		  Drivable d=new Bike();
		  d.driving();
		  d.breaking();
		System.out.println(Drivable.DRIVE);
		  
		  Vehicle v=new Bike();//Vehicle-->Motorcycle-->Bike
		  v.operatevehicle();
		  
	}

}
       
	







