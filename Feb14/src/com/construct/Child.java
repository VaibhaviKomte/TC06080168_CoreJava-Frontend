package com.construct;

public class Child extends Parent
{
    public Child()
    {
    	System.out.println("Child class constructor"); 
    }
    
    public Child(int num)
    {
    	System.out.println("Child class parameterized constructor"); 
    }
    
    public void display()
    {
    	System.out.println("Hello friends!!!");
    }
	public static void main(String[] args) 
	{
		Child c1=new Child();
		c1.display();

	}

}
