package com.abstrac;

public class TestClient 
{

	public static void main(String[] args) 
	{
		Bank b = new HDFCBank();
		
		b.getROI();
		b.deposite();
		b.withdraw();
		b.calculateManagerSalary();
		
		System.out.println("");
		
		b = new ICICIBank();
		b.getROI();
		b.deposite();
		b.withdraw();
		b.calculateEmployeeBonus();
		
		
		
	  /* Human h = new Man();
	   h.eat();
	   h.run();
	   h.speak();
	   System.out.println("");
	   h = new Woman();
	   h.eat();
	   h.run();
	   h.speak();  */
	}

}
