package com.acc;

public class Employee 
{
	static int noemp=0;
	int id;
	String name;
	String address;
	int salary;
	Employee()
	{}
	
	Employee(int id, String name, String address, int salary)
	{
		super();
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;
		noemp=noemp+1;			
	}
	public static void display()
	{
		System.out.println("Total no. of employees are = "+noemp);
	}

	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
	

}
