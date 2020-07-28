package com.syntax.class26;

public class PhoneTask {

	public static void main(String[] args) {
		

		//Phone phone=new Phone(); we can not create an obj of Abstract class
		
		
		Phone iphone=new IPhone();// created an obj of a child
		
		iphone.makeCall();
		iphone.sendText();
		iphone.navigate();
		iphone.playMusic();
		
		
		Phone samsung=new Samsung();
		
		samsung.makeCall();
		samsung.sendText();
		samsung.navigate();
		samsung.playMusic();
		
		
	}

}
