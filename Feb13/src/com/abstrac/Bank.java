package com.abstrac;

public abstract class Bank 
{
	abstract public float getROI();
	public void deposite()
	{
		System.out.println("Cash is deposited");
		
	}
	
	public void withdraw()
	{
		System.out.println("Cash is withdrawen");	
	}
	
	public float calculateManagerSalary()
    {
   	 return 0;
    }
	 public float calculateEmployeeBonus()
    {
	   	 return 0;
    }
}
