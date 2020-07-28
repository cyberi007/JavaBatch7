package com.syntax.class27;


abstract class Mortgage{
	
	public abstract void giveMortgage();
}

public interface Trustable {

	void trust();
	
}
	interface Bank extends Trustable{
	
		void deposit();
		void withdraw();
	}
		
		class PNC extends Mortgage implements Bank, Investments{
			
			public void deposit() {
				System.out.println("PNC bank takes deposits");
			}
			public void withdraw() {
				System.out.println("PNC gives you your money");
			}
			
			public void trust() {
				System.out.println("You can trust PNC bank");
			}
			
			public void giveMortgage() {
				System.out.println("PNC gives mortgages");
			}
			
			public void doInvestments() {
				System.out.println("You can invest your money with PNC");
			}
		}
		
		
		
		
		
		
		
		
		

