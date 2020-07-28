package com.syntax.class20;

class Dog{
	  
    String dogName;
    int dogWeight;
    static String dogBreed="Mutt";
    
    

Dog(String dogName,String dogBreed,int dogWeight){
  
	this.dogName=dogName;
	this.dogWeight=dogWeight;
	this.dogBreed=dogBreed;
  
}


public void displayInfo(){
  System.out. println(dogName + " " +dogBreed + " "+ dogWeight);
}
}